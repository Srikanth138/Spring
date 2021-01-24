package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.documnet.PersonInfo;

public interface IPersonInfoRepo extends MongoRepository<PersonInfo, Integer> {

}
