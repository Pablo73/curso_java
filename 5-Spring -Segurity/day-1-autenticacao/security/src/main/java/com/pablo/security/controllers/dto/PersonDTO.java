package com.pablo.security.controllers.dto;

import com.pablo.security.models.entities.Person;

public record PersonDTO(Long id, String name, String email, String username, String password, String role) {
  public Person toEntity(){
    return new Person(id, name, email, username, password, role);
  }
}
