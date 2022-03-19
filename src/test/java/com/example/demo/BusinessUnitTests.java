package com.example.demo;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.controller.PersonController;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;
import com.example.demo.service.TweetService;

@RunWith(MockitoJUnitRunner.class)
public class BusinessUnitTests {

	@Mock
	private PersonService personService;
	
	@Mock
	private PersonRepository personRepository;
	
	@Mock
	private TweetService tweetService;
	
	@InjectMocks
	private PersonController personController;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void savePerson() {
		
		int idportfolio = 123;
		String experience_summary = "An experience for this person";
		String image_url = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/miopia-harry-potter-1568882121.jpg?crop=1.00xw:1.00xh;0,0&resize=980:*";
		String names = "Jhon";
		String last_names = "Wick";
		String email = "jhonwick@gmail.com";
		String phone = "999999999";
		
		Person mockedPerson = Person.builder()
				.idportfolio(idportfolio)
				.experience_summary(experience_summary)
				.image_url(image_url)
				.names(names)
				.last_names(last_names)
				.email(email)
				.phone(phone)
				.build();
		
		Mockito.when(personService.getById(idportfolio)).thenReturn(mockedPerson);
		
		Person personToSave = Person.builder()
				.idportfolio(idportfolio)
				.experience_summary(experience_summary)
				.image_url(image_url)
				.names(names)
				.last_names(last_names)
				.email(email)
				.phone(phone)
				.build();
		
		personController.edit(personToSave, idportfolio);
		
		verify(personRepository,times(0)).save(personToSave);
		
		
	}
	
}
