package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import com.example.demo.service.TweetService;

import twitter4j.TwitterException;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/"})
public class PersonController {

	@Autowired
	PersonService personService;
	
	@Autowired
	TweetService tweetService;
	
	@GetMapping(value = "/portfolio")
	public List<Person> getList(){
		
		return personService.getList();
		
	}
	
	@GetMapping(value = "/get-timeline")
	public List<String> getStatusUserTimeline() throws TwitterException{
		
		return tweetService.getLatestTweets();
		
	}
	
	@GetMapping(path="/{idportfolio}")
	public Person getById(@PathVariable("idportfolio")int idportfolio) {
		return personService.getById(idportfolio);
	}
	
	@PutMapping(path = "/{idportfolio}")
	public Person edit(@RequestBody Person p, @PathVariable("idportfolio") int idportfolio) {
		p.setIdportfolio(idportfolio);
		return personService.edit(p);
	}
	
	@DeleteMapping(path = "/{idportfolio}")
	public Person delete(@PathVariable("idportfolio") int idportfolio) {
		return personService.delete(idportfolio);
	}
	
	
	
	
}
