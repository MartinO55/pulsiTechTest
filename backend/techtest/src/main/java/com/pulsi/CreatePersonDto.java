package com.pulsi;

public class CreatePersonDto {

  //this is where we validate the data being passed in from the frontend - if the data is incorrect it will fire an error before trying to insert it into the database

  // depending on what we actually want in the database we would add annotations to these - based on the business rules (like @NotBlank if we wanted to make it required)
  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  String streetAddress;

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  String city;

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  Boolean retired;

  public Boolean getRetired() {
    return retired;
  }

  public void setRetired(Boolean retired) {
    this.retired = retired;
  }

  public CreatePersonDto(
    String name,
    String streetAddress,
    String city,
    int age,
    Boolean retired
  ) {
    this.name = name;
    this.streetAddress = streetAddress;
    this.city = city;
    this.age = age;
    this.retired = retired;
  }
}
