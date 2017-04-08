package com.bionic.baglab.domains;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by nicot on 4/2/2017.
 */
@Entity
@Table(name = "bag_type_price", schema = "baglab")
public class BagTypePriceEntity {
    private long idbagTypePrice;
    private long bagTypeId;
    private Timestamp date;
    private Integer price;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idbag_type_price")
    public long getIdbagTypePrice() {
        return idbagTypePrice;
    }

    public void setIdbagTypePrice(long idbagTypePrice) {
        this.idbagTypePrice = idbagTypePrice;
    }

    @Basic
    @Column(name = "bag_type_id")
    public long getBagTypeId() {
        return bagTypeId;
    }

    public void setBagTypeId(long bagTypeId) {
        this.bagTypeId = bagTypeId;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BagTypePriceEntity that = (BagTypePriceEntity) o;

        if (idbagTypePrice != that.idbagTypePrice) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idbagTypePrice ^ (idbagTypePrice >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
