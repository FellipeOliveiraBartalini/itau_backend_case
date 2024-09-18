package com.itaucase.demo.services;

import org.springframework.stereotype.Service;

import com.itaucase.demo.models.PersonModel;

@Service
public class PersonService {
    public PersonModel getPerson() {
        PersonModel person = new PersonModel(1L, "Fellipe DEV", "fellipe@dev.com");
        return person;
    }
}
