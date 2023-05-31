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

  //this is where we define what we are keeping in the database; specifically, what makes up a person. I am going to remove children from the front end because it is causing some annoyance, and also would likely violate business rules
  // I think the best way to handle kids is to add a separate table and add a foreign key to this one
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column
  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column
  String streetAddress;

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  @Column
  Date createdAt;

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @Column
  String city;

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Column
  int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Column
  Boolean retired;

  public Boolean getRetired() {
    return retired;
  }

  public void setRetired(Boolean retired) {
    this.retired = retired;
  }

  public Person(
    Long id,
    String name,
    String streetAddress,
    Date createdAt,
    String city,
    int age,
    Boolean retired
  ) {
    super();
    this.id = id;
    this.name = name;
    this.streetAddress = streetAddress;
    this.createdAt = createdAt;
    this.city = city;
    this.age = age;
    this.retired = retired;
  }

  public Person() {}
}
