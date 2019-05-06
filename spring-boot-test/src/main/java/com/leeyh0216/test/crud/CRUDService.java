package com.leeyh0216.test.crud;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRUDService {

    private MongoTemplate mongoTemplate;

    public CRUDService(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    public Person createPerson(Person person){
        mongoTemplate.insert(person);
        return person;
    }

    public List<Person> getPeople(){
        return mongoTemplate.findAll(Person.class);
    }
}
