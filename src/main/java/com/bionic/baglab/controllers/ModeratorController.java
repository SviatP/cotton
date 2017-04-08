package com.bionic.baglab.controllers;

import com.bionic.baglab.domains.ModelEntity;
import com.bionic.baglab.domains.OrderEntity;
import com.bionic.baglab.domains.OrderStatusEntity;
import com.bionic.baglab.dto.ModelDto;
import com.bionic.baglab.dto.OrderDto;
import com.bionic.baglab.services.ModelService;
import com.bionic.baglab.services.OrderService;
import com.bionic.baglab.services.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by potaychuk on 28.03.2017.
 */
@RestController
public class ModeratorController {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderStatusService orderStatusService;

    @Autowired
    ModelService modelService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    @ResponseBody
    public Set<OrderDto> getOrders() {
        return orderService.findAll();
    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    @ResponseBody
    public Set<OrderDto> getOrdersS() {
        return orderService.findAll();
    }

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    @ResponseBody
    public OrderDto getOrderById( @PathVariable long id) {
        return orderService.getOrderDtoById(id);
    }

    @RequestMapping(value = "/order/{id}/models", method = RequestMethod.GET)
    @ResponseBody
    public Set<ModelDto> getOrderModels(@PathVariable long id) {
        return orderService.findOrderModels(id);
    }

    /**
     * This method returns model which contains in order
     * @param id - order's id
     * @param modelId - model's id
     * @return model
     */
    @RequestMapping(value = "/order/{id}/models/{modelId}", method = RequestMethod.GET)
    @ResponseBody
    public ModelDto getModel(@PathVariable(name = "id") long id,
                             @PathVariable(name = "modelId") long modelId) {
        OrderEntity oe = orderService.findOne(id);
        ModelEntity me = modelService.findOne(modelId);
        if (oe.getModels().contains(me)){
            return new ModelDto(me);
        } else {
            //// TODO: 07.04.2017  should implement custom exception, or return null
            throw new RuntimeException("No such model in current order") ;
        }
    }

    @RequestMapping(value = "/order/{id}/{action}", method = RequestMethod.POST)
    @ResponseBody
    public void acceptOrder(@PathVariable long id,
                            @PathVariable String action) {
        OrderEntity oe = orderService.findOne(id);
        OrderStatusEntity ose = orderStatusService.findByCode(action);
        if (!oe.getOrderStatus().equals(ose)){
            oe.setOrderStatus(ose);
            orderService.save(oe);
        }
    }

}
