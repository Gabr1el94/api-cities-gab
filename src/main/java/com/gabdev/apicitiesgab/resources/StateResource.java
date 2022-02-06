package com.gabdev.apicitiesgab.resources;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabdev.apicitiesgab.entities.State;
import com.gabdev.apicitiesgab.repositories.StateRepository;

@RestController
@RequestMapping("/states")
public class StateResource {

  private final StateRepository repository;

  public StateResource(final StateRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public Page<State> states(final Pageable page) {
    return repository.findAll(page);
  }
}