package org.springframework.data.samplespringdatacustomrepositories.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.samplespringdatacustomrepositories.domain.Company;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "crud-company", path = "crud-company")
public interface CrudCompanyRepository extends CrudRepository<Company, Long> {
    List<Company> findByName(@Param("name") String name);
}
