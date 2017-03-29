package com.bionic.baglab.services;

import com.bionic.baglab.dao.OrderDao;
import com.bionic.baglab.domains.OrderEntity;
import com.bionic.baglab.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by potaychuk on 29.03.2017.
 */
@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    public Set<OrderDto> findAll(){
        List<OrderEntity> temp = orderDao.findAll();
        Set<OrderDto> result = new HashSet<>();
        for (OrderEntity ent: temp) {
            result.add(new OrderDto(ent));
        }
       return result;
    }

}
