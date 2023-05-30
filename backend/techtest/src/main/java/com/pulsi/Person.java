package com.pulsi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "persons")
public class Person implements Serializable {

  @Column
  String name;

  @Column
  String address;

  @Column
  Date createdAt;

  public Person(Long id, String name, String address, Date createdAt) {
    super();
    this.id = id;
    this.name = name;
    this.address = address;
    this.createdAt = createdAt;
  }

  public Person() {}

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
}
