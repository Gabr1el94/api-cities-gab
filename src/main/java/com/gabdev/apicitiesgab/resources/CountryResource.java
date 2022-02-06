package com.gabdev.apicitiesgab.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabdev.apicitiesgab.entities.Country;
import com.gabdev.apicitiesgab.repositories.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {
	
	private CountryRepository countryRepository;
	
	public CountryResource(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	
	@GetMapping
	public List<Country> countries(){
		return countryRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity countryById(@PathVariable Long id){
		Optional<Country> country = countryRepository.findById(id); 
		if (country.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(country.get());
	}

}
