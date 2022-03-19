package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Person;

public interface PersonService {
	
	List<Person> getList();
	Person getById(int id);
	Person add(Person person);
	Person edit(Person person);
	Person delete(int id);
	
	

}
