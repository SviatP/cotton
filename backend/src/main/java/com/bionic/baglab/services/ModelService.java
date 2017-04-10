package com.bionic.baglab.services;

import com.bionic.baglab.dao.ModelDao;
import com.bionic.baglab.domains.ModelEntity;
import com.bionic.baglab.dto.ModelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by Anton on 03-Apr-17.
 */
@Service
public class ModelService {
    @Autowired
    ModelDao modelDao;

    public ModelEntity findOne(long id) {
        return modelDao.findOne(id);
    }

    public ModelDto findOneDto(long id) {
        return new ModelDto(modelDao.findOne(id));
    }

    public List<ModelEntity> findAllModelsbyUserId(long id) {
        return modelDao.findAllModelsbyUserId(id);
    }

    public void save(ModelEntity model) {
        modelDao.save(model);
    }
}
