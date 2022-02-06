package com.gabdev.apicitiesgab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabdev.apicitiesgab.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
