package com.bionic.baglab.dto;

import com.bionic.baglab.domains.ModelEntity;

/**
 * Created by potaychuk on 29.03.2017.
 */
public class ModelDto {
    private long id;

    public ModelDto() {
    }

    public ModelDto(ModelEntity modelEntity) {
        this.id = modelEntity.getIdModel();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
