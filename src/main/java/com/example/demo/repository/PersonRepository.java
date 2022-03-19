package com.example.demo.repository;

import org.springframework.data.repository.Repository;
import java.util.List;
import com.example.demo.entity.Person;

public interface PersonRepository extends Repository<Person, Integer>{
	
	List<Person> findAll();
	Person findById(int id);
	Person save(Person person);
	void delete (Person person);

}
