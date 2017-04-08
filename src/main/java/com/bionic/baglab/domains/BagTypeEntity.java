package com.bionic.baglab.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bag_type", schema = "baglab")
public class BagTypeEntity {
    private Long idBagType;
    private String script;
    private List<BagTypePriceEntity> prices;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idBagType")
    public Long getIdBagType() {
        return idBagType;
    }

    public void setIdBagType(Long idBagType) {
        this.idBagType = idBagType;
    }

    @Basic
    @Column(name = "script", columnDefinition = "MEDIUMTEXT")
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "bag_type_id")
    @JsonIgnore
    public List<BagTypePriceEntity> getPriceEntities() {
        return prices;
    }

    public void setPriceEntities(List<BagTypePriceEntity> priceEntities) {
        this.prices = priceEntities;
    }

    @Transient
    //@JsonIgnore
    public Integer getLastPrice() {
        List<BagTypePriceEntity> prices = getPriceEntities();
        return !prices.isEmpty()
                ? prices.get(prices.size() - 1).getPrice()
                : -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BagTypeEntity that = (BagTypeEntity) o;

        if (idBagType != that.idBagType) return false;
        if (prices != that.prices) return false;
        if (script != null ? !script.equals(that.script) : that.script != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idBagType ^ (idBagType >>> 32));
        result = 31 * result + (script != null ? script.hashCode() : 0);
        result = 31 * result + prices.hashCode();
        return result;
    }
}
