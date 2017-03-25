package com.bionic.baglab.domains;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "pages_type", schema = "baglab")
public class PagesTypeEntity {
    private int idpagesType;
    private String type;
    private Collection<PagesEntity> pagesEntityByIdpagesType;

    @Id
    @Column(name = "idpages_type")
    public int getIdpagesType() {
        return idpagesType;
    }

    public void setIdpagesType(int idpagesType) {
        this.idpagesType = idpagesType;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PagesTypeEntity that = (PagesTypeEntity) o;

        if (idpagesType != that.idpagesType) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpagesType;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
//
//    @OneToMany(mappedBy = "pagesTypeByPagesTypeId")
//    public Collection<PagesEntity> getPagesByIdpagesType() {
//        return pagesEntityByIdpagesType;
//    }
//
//    public void setPagesByIdpagesType(Collection<PagesEntity> pagesEntityByIdpagesType) {
//        this.pagesEntityByIdpagesType = pagesEntityByIdpagesType;
//    }
}
