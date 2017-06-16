package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * Created by cameronsima on 6/15/17.
 */

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;


    @GetMapping("/person")
    public List getPeople() {

        public Person
    }


}
