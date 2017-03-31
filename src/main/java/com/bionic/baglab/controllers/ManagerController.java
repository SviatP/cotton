package com.bionic.baglab.controllers;


import com.bionic.baglab.domains.OrderEntity;
import com.bionic.baglab.domains.OrderStatusEntity;
import com.bionic.baglab.dto.OrderDto;
import com.bionic.baglab.dto.user.UserDto;
import com.bionic.baglab.services.OrderService;
import com.bionic.baglab.services.OrderStatusService;
import com.bionic.baglab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * China-manager controller
 */

@RestController
@RequestMapping("/manager")
public class ManagerController {
    private final String managerRole = "Factory"; //todo: delete temp constant
    private final String orderStatus = "accepted";

    @Autowired
    UserService userService;

    @Autowired
    OrderService orderService;

    @Autowired
    OrderStatusService orderStatusService;

    @RequestMapping(value = "/list") //List USERS with ROLE manager "Factory"
    public ResponseEntity<Set<UserDto>> listAllManagers(){
        Set<UserDto> managers = userService.getAllUsersByRole(managerRole);
            if(managers.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);// HttpStatus.NOT_FOUND
            }
        return new ResponseEntity<>(managers, HttpStatus.OK);
    }

    //Manager. List all orders that was approved by Moderator + models in them
    @RequestMapping(value = "/orders")  //todo: bug - show only one orderDTO
    public ResponseEntity<List<OrderDto>> listApprovedOrders(){
        List<OrderDto> orders = orderService.getAllOrdersByStatus(orderStatus);
        /*if(orders.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//HttpStatus.NOT_FOUND
        }*/
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    /**
     * Manager. Change orders status to "send"
     * @param id - order id
     * @param action - new order status
     */
    @RequestMapping(value = "/{id}/{action}") //todo: add limitation to possible actions for Order status
    @ResponseBody
    public void acceptOrder(@PathVariable long id, @PathVariable String action) {
        System.out.println("id:------------" + id + "----------" + action);
        OrderEntity orderEntity = orderService.findOne(id);
        OrderStatusEntity orderStatusEntity = orderStatusService.findByCode(action);
        if (!orderEntity.getOrderStatus().equals(orderStatusEntity)){
            orderEntity.setOrderStatus(orderStatusEntity);
            orderService.save(orderEntity);
        }

    }





}
