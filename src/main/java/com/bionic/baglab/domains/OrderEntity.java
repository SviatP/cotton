package com.bionic.baglab.domains;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "order", schema = "baglab")
public class OrderEntity {
    private int idOrder;
    private Timestamp orderCreate;
    private Timestamp orderUpdate;
    private OrderStatusEntity orderStatusByOrderStatusId;

    @Id
    @Column(name = "idOrder")
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "orderCreate")
    public Timestamp getOrderCreate() {
        return orderCreate;
    }

    public void setOrderCreate(Timestamp orderCreate) {
        this.orderCreate = orderCreate;
    }

    @Basic
    @Column(name = "orderUpdate")
    public Timestamp getOrderUpdate() {
        return orderUpdate;
    }

    public void setOrderUpdate(Timestamp orderUpdate) {
        this.orderUpdate = orderUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (idOrder != that.idOrder) return false;
        if (orderCreate != null ? !orderCreate.equals(that.orderCreate) : that.orderCreate != null) return false;
        if (orderUpdate != null ? !orderUpdate.equals(that.orderUpdate) : that.orderUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + (orderCreate != null ? orderCreate.hashCode() : 0);
        result = 31 * result + (orderUpdate != null ? orderUpdate.hashCode() : 0);
        return result;
    }

 /*   @ManyToOne
    @JoinColumn(name = "orderStatusId", referencedColumnName = "idorder_status", nullable = false)
    public OrderStatusEntity getOrderStatusByOrderStatusId() {
        return orderStatusByOrderStatusId;
    }

    public void setOrderStatusByOrderStatusId(OrderStatusEntity orderStatusByOrderStatusId) {
        this.orderStatusByOrderStatusId = orderStatusByOrderStatusId;
    }*/
}
