package com.bionic.baglab.dao;
import com.bionic.baglab.domains.MaterialEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RepositoryRestResource(collectionResourceRel = "material", path = "material")
public interface MaterialDao extends CrudRepository<MaterialEntity, Long> {

}