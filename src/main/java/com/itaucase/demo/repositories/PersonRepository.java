package com.itaucase.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itaucase.demo.models.PersonModel;

public interface PersonRepository extends JpaRepository<PersonModel, Long> {

}
