package com.bionic.baglab.domains;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@javax.persistence.Table(name = "material_price", schema = "baglab")
public class MaterialPriceEntity {
    private long idmaterialPrice;
    private int price;
    private long materialId;

    public MaterialPriceEntity() {
    }

    public MaterialPriceEntity(int price, long materialId) {
        this.price = price;
        this.materialId = materialId;
    }

    @Id
    @javax.persistence.Column(name = "idmaterial_price")
    public long getIdmaterialPrice() {
        return idmaterialPrice;
    }

    public void setIdmaterialPrice(long idmaterialPrice) {
        this.idmaterialPrice = idmaterialPrice;
    }


    @Basic
    @javax.persistence.Column(name = "materialId")
    public long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    private Timestamp date;

    @Basic
    @javax.persistence.Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @javax.persistence.Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialPriceEntity that = (MaterialPriceEntity) o;

        if (idmaterialPrice != that.idmaterialPrice) return false;
        if (materialId != that.materialId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idmaterialPrice ^ (idmaterialPrice >>> 32));
        result = (int) (31 * result + (materialId ^ (materialId >>> 32)));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
