package com.pulsi;

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
}
