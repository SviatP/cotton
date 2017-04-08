package com.bionic.baglab.dao;


import com.bionic.baglab.domains.BagTypeEntity;
import com.bionic.baglab.domains.ModelEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RepositoryRestResource(collectionResourceRel = "bag_type", path = "bag_type")
public interface BagTypeDao extends CrudRepository<BagTypeEntity, Long> {

    @Query("select b from BagTypeEntity b")
    List<BagTypeEntity> findExistent();

    BagTypeEntity findOne(long id);
}

