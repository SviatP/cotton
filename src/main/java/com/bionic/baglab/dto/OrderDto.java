package com.bionic.baglab.dto;

import com.bionic.baglab.domains.ModelEntity;
import com.bionic.baglab.domains.OrderEntity;
import com.bionic.baglab.domains.UserEntity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Created by potaychuk on 29.03.2017.
 */
public class OrderDto {

    private UserDto userDto;
    private int idOrder;
    private OrderStatusDTO status;
    private Timestamp orderCreate;
    private Collection<ModelDto> models;


    public OrderDto() {
    }

    public OrderDto(OrderEntity orderEntity) {

        this.userDto = new UserDto(orderEntity.getUser());
        this.idOrder = orderEntity.getIdOrder();
        this.status = new OrderStatusDTO(orderEntity.getOrderStatus());
        this.orderCreate = orderEntity.getOrderCreate();
        models = new LinkedList<>();
        models.addAll(orderEntity.getModels().stream().map(ModelDto::new).collect(Collectors.toList()));
    }

    public Collection<ModelDto> getModels() {
        return models;
    }

    public void setModels(Collection<ModelDto> models) {
        this.models = models;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public OrderStatusDTO getStatus() {
        return status;
    }

    public void setStatus(OrderStatusDTO status) {
        this.status = status;
    }

    public Timestamp getOrderCreate() {
        return orderCreate;
    }

    public void setOrderCreate(Timestamp orderCreate) {
        this.orderCreate = orderCreate;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDto orderDto = (OrderDto) o;

        if (status != null ? !status.equals(orderDto.status) : orderDto.status != null)
            return false;
        return orderCreate != null ? orderCreate.equals(orderDto.orderCreate) : orderDto.orderCreate == null;

    }

    @Override
    public int hashCode() {
        int result = status != null ? status.hashCode() : 0;
        result = 31 * result + (orderCreate != null ? orderCreate.hashCode() : 0);
        return result;
    }
}
