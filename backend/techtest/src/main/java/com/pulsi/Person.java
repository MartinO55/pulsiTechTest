package com.pulsi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "persons")
public class Person implements Serializable {

  String name;
  String address;

  public Person(Long id, String name, String address) {
    super();
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public Person() {}

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
}
