//package com.bionic.baglab.domains;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//
///**
// * Created by nicot on 4/2/2017.
// */
//@Entity
//@Table(name = "model_price", schema = "baglab")
//public class ModelPriceEntity {
//    private long idmodelPrice;
//    private long modelId;
//    private Timestamp date;
//    private Integer price;
//
//    public ModelPriceEntity() {
//    }
//
//    public ModelPriceEntity(long modelId, Integer price) {
//        this.modelId = modelId;
//        this.price = price;
//    }
//
//    @Id
//    @Column(name = "idmodel_price")
//    public long getIdmodelPrice() {
//        return idmodelPrice;
//    }
//
//    public void setIdmodelPrice(long idmodelPrice) {
//        this.idmodelPrice = idmodelPrice;
//    }
//
//    @Basic
//    @Column(name = "modelId")
//    public long getModelId() {
//        return modelId;
//    }
//
//    public void setModelId(long modelId) {
//        this.modelId = modelId;
//    }
//
//    @Basic
//    @Column(name = "date")
//    public Timestamp getDate() {
//        return date;
//    }
//
//    public void setDate(Timestamp date) {
//        this.date = date;
//    }
//
//    @Basic
//    @Column(name = "price")
//    public Integer getPrice() {
//        return price;
//    }
//
//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ModelPriceEntity that = (ModelPriceEntity) o;
//
//        if (idmodelPrice != that.idmodelPrice) return false;
//        if (modelId != that.modelId) return false;
//        if (date != null ? !date.equals(that.date) : that.date != null) return false;
//        if (price != null ? !price.equals(that.price) : that.price != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = (int) (idmodelPrice ^ (idmodelPrice >>> 32));
//        result = 31 * result +  (int) (modelId ^ (modelId >>> 32));
//        result = 31 * result + (date != null ? date.hashCode() : 0);
//        result = 31 * result + (price != null ? price.hashCode() : 0);
//        return result;
//    }
//}
