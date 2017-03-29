package com.bionic.baglab.domains;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "orderStatus", schema = "baglab")
public class OrderStatusEntity {
    private int idorderStatus;
    private String code;
    private String description;
    private byte deleted;
    private Collection<OrderEntity> ordersByIdorderStatus;

    @Id
    @Column(name = "idorder_status")
    public int getIdorderStatus() {
        return idorderStatus;
    }

    public void setIdorderStatus(int idorderStatus) {
        this.idorderStatus = idorderStatus;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "description", columnDefinition="mediumtext")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "deleted", columnDefinition = "BitTypeDescriptor")
    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderStatusEntity that = (OrderStatusEntity) o;

        if (idorderStatus != that.idorderStatus) return false;
        if (deleted != that.deleted) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idorderStatus;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) deleted;
        return result;
    }

   /* @OneToMany(mappedBy = "orderStatusByOrderStatusId")
    public Collection<OrderEntity> getOrdersByIdorderStatus() {
        return ordersByIdorderStatus;
    }

    public void setOrdersByIdorderStatus(Collection<OrderEntity> ordersByIdorderStatus) {
        this.ordersByIdorderStatus = ordersByIdorderStatus;
    }*/
}
