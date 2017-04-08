package com.bionic.baglab.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by nicot on 4/2/2017.
 */
@Entity
@Table(name = "material", schema = "baglab")
public class MaterialEntity {
    private long idmaterial;
    private String name;
    private byte deleted;
private List<MaterialPriceEntity> prices;
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
    @Column(name = "deleted", columnDefinition = "BitTypeDescriptor")
    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "materialId")
    @JsonIgnore
    public List<MaterialPriceEntity> getPriceEntities() {
        return prices;
    }

    public void setPriceEntities(List<MaterialPriceEntity> priceEntities) {
        this.prices = priceEntities;
    }

    @Transient
    public Integer getLastPrice() {
        return !prices.isEmpty()
                ? prices.get(prices.size() - 1).getPrice()
                : -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialEntity that = (MaterialEntity) o;

        if (idmaterial != that.idmaterial) return false;
        if (deleted != that.deleted) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idmaterial ^ (idmaterial >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) deleted;
        return result;
    }
}
