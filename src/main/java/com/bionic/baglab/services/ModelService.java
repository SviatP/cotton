package com.bionic.baglab.services;

import com.bionic.baglab.dao.ModelDao;
import com.bionic.baglab.domains.ModelEntity;
import com.bionic.baglab.dto.ModelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * Created by Potaychuk on 07.04.2017.
 */
@Service
public class ModelService {

    @Autowired
    ModelDao modelDao;

    public ModelEntity findOne(long id){
        return modelDao.findOne(id);
    }

    public ModelDto findOneDto(long id){
        return new ModelDto(modelDao.findOne(id));
    }

    public List<ModelEntity> findAllModelsbyUserId (long id){
        return modelDao.findAllModelsbyUserId(id);
    }

    public ModelEntity save(ModelEntity model) {
        return modelDao.save(model);
    }
}
