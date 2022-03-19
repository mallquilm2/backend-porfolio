package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> getList() {
		return personRepository.findAll();
	}

	@Override
	public Person getById(int id) {
		return personRepository.findById(id);
	}

	@Override
	public Person add(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person edit(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person delete(int id) {
		Person person=personRepository.findById(id);
		if(person!=null) {
			personRepository.delete(person);
		}
		return person;
	}

	

}
