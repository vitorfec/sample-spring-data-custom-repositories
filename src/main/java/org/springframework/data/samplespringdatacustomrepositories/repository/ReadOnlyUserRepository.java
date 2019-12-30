package org.springframework.data.samplespringdatacustomrepositories.repository;

import org.springframework.data.repository.ReadOnlyRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.samplespringdatacustomrepositories.domain.User;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "ro-users", path = "ro-users")
public interface ReadOnlyUserRepository extends ReadOnlyRepository<User, Long> {
    List<User> findByName(@Param("name") String name);
}
