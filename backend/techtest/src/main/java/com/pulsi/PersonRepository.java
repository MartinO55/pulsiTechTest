package com.pulsi;

import org.springframework.data.jpa.repository.JpaRepository;

//I just wanted to use the functions in jpa repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
