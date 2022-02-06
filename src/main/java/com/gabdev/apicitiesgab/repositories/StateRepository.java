package com.gabdev.apicitiesgab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabdev.apicitiesgab.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
