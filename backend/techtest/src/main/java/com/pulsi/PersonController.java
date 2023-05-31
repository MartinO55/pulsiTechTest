package com.pulsi;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonController {

  @Autowired
  private PersonService personService;

  @PostMapping
  public ResponseEntity<Person> createPerson(
    @Valid @RequestBody CreatePersonDto data
  ) {
    Person createdPerson = this.personService.create(data);
    return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Person>> getPersons() {
    List<Person> allPersons = this.personService.getPersons();
    return new ResponseEntity<>(allPersons, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
    Optional<Person> maybePerson = this.personService.findById(id);

    if (maybePerson.isEmpty()) {
      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    return new ResponseEntity<>(maybePerson.get(), HttpStatus.OK);
  }

  @PutMapping
  public ResponseEntity<Person> updatePersonById(
    @PathVariable Long id,
    @Valid @RequestBody CreatePersonDto data
  ) throws NotFoundException {
    Person updatedPerson =
      this.personService.updatePersonById(id, data)
        .orElseThrow(() ->
          new NotFoundException("could not find person with id: " + id)
        );
    return new ResponseEntity<>(updatedPerson, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deletePersonById(@PathVariable Long id) {
    Optional<Person> maybePerson = this.personService.findById(id);

    if (maybePerson.isEmpty()) {
      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
    this.personService.deletePersonById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
