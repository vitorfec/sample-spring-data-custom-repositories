package org.springframework.data.samplespringdatacustomrepositories.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ReadOnlyUserRepositoryTests {

    @Autowired
    ReadOnlyUserRepository readOnlyUserRepository;

    @Test
    public void testFindAll(){
        var users = readOnlyUserRepository.findAll();
        assertThat(users).isEmpty();
    }

    @Test
    public void testFindByName(){
        var users = readOnlyUserRepository.findByName("name");
        assertThat(users).isEmpty();
    }

}
