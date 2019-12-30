package org.springframework.data.samplespringdatacustomrepositories.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.samplespringdatacustomrepositories.domain.Company;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CrudCompanyRepositoryTests {

    @Autowired
    CrudCompanyRepository crudCompanyRepository;

    @Test
    public void testFindAll(){
        var companies = crudCompanyRepository.findAll();
        assertThat(companies).isEmpty();
    }

    @Test
    public void testFindByName(){
        var companies = crudCompanyRepository.findByName("name");
        assertThat(companies).isEmpty();
    }

    @Test
    public void testSave(){
        var company = new Company();
        company.setName("new company");
        crudCompanyRepository.save(company);
        var companies = crudCompanyRepository.findAll();
        assertThat(companies).isNotEmpty();
    }

}
