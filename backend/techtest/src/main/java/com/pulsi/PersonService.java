package com.pulsi;

import jakarta.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  //we need this one to do update by ID
  @Autowired
  private ModelMapper mapper;

  public Person create(@Valid CreatePersonDto data) {
    String name = data.getName().trim();
    String streetAddress = data.getStreetAddress().trim();
    int age = data.getAge();
    String city = data.getCity().trim();
    Boolean retired = data.getRetired();

    Person newPerson = new Person();

    newPerson.setName(name);
    newPerson.setAge(age);
    newPerson.setCity(city);
    newPerson.setStreetAddress(streetAddress);
    newPerson.setRetired(retired);
    newPerson.setCreatedAt(new Date());
    return this.personRepository.save(newPerson);
  }

  public List<Person> getPersons() {
    return this.personRepository.findAll();
  }

  public Optional<Person> findById(Long id) {
    return this.personRepository.findById(id);
  }

  public Optional<Person> updatePersonById(
    Long id,
    @Valid CreatePersonDto data
  ) {
    Optional<Person> maybePerson = this.findById(id);
    if (maybePerson.isEmpty()) {
      return maybePerson;
    }
    Person existingPerson = maybePerson.get();

    mapper.map(data, existingPerson);
    return Optional.of(this.personRepository.save(existingPerson));
  }

  public void deletePersonById(Long id) {
    this.personRepository.deleteById(id);
  }
}
