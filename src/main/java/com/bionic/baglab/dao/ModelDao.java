package com.bionic.baglab.dao;

import com.bionic.baglab.domains.ModelEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RepositoryRestResource(collectionResourceRel = "models", path = "models")
public interface ModelDao extends CrudRepository<ModelEntity, Long> {

//    @Query("select e from ModelEntity e where e.deleted = false")
//    List<ModelEntity> findExistent();

    @Query("select model from ModelEntity model where model.user.idUser = :id")
    List<ModelEntity> findAllModelsbyUserId (@Param("id") long userId);


}
