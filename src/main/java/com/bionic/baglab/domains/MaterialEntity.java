package com.bionic.baglab.domains;

import javax.persistence.*;

/**
 * Created by nicot on 4/2/2017.
 */
@Entity
@Table(name = "material", schema = "baglab")
public class MaterialEntity {
    private long idmaterial;
    private String name;
    private int price;
    private byte deleted;

    @Id
    @Column(name = "idmaterial")
    public long getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(long idmaterial) {
        this.idmaterial = idmaterial;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

        MaterialEntity that = (MaterialEntity) o;

        if (idmaterial != that.idmaterial) return false;
        if (price != that.price) return false;
        if (deleted != that.deleted) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idmaterial ^ (idmaterial >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (int) deleted;
        return result;
    }
}
