package com.bionic.baglab.domains;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by potaychuk on 28.03.2017.
 */
@Entity
@Table(name = "order", schema = "baglab")
public class OrderEntity {
    private int idOrder;
    private UserEntity user;
    private int orderStatusId;
    private Timestamp orderCreate;
    private Timestamp orderUpdate;

    @Id
    @Column(name = "idOrder")
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    public UserEntity getUser() {
        return this.user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Column(name = "orderStatusId")
    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    @Column(name = "orderCreate")
    public Timestamp getOrderCreate() {
        return orderCreate;
    }

    public void setOrderCreate(Timestamp orderCreate) {
        this.orderCreate = orderCreate;
    }

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
        if (user != that.user) return false;
        if (orderStatusId != that.orderStatusId) return false;
        if (orderCreate != null ? !orderCreate.equals(that.orderCreate) : that.orderCreate != null) return false;
        if (orderUpdate != null ? !orderUpdate.equals(that.orderUpdate) : that.orderUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + orderStatusId;
        result = 31 * result + (orderCreate != null ? orderCreate.hashCode() : 0);
        result = 31 * result + (orderUpdate != null ? orderUpdate.hashCode() : 0);
        return result;
    }
}
