package com.leeyh0216.test.crud;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class CRUDController {

    private CRUDService crudService;

    public CRUDController(CRUDService crudService) {
        this.crudService = crudService;
    }

    @PostMapping("")
    public Person createPerson(@RequestBody Person person){
        return crudService.createPerson(person);
    }

    @GetMapping("")
    public List<Person> getPeoples(){
        return crudService.getPeople();
    }
}
