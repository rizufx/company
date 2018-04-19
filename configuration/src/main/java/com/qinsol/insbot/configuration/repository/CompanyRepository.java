package com.qinsol.insbot.configuration.repository;


import com.qinsol.insbot.configuration.entity.CompanyConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by fahmida on 4/10/2018.
 */
public interface CompanyRepository extends MongoRepository<CompanyConfig, String> {

    public CompanyConfig findById(Integer id) throws Exception;

    public List<CompanyConfig> findAll();
}
