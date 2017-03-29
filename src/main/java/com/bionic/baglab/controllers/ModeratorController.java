package com.bionic.baglab.controllers;

import com.bionic.baglab.dto.OrderDto;
import com.bionic.baglab.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Created by potaychuk on 28.03.2017.
 */
@RestController
public class ModeratorController {
    @Autowired
    OrderService orderService;


    @RequestMapping(value = "/orders")
    @ResponseBody
    public Set<OrderDto> getOrders() {
        return orderService.findAll();
    }

}
