package com.example.demo.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="portfolio")
public class Person {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idportfolio;
	
	@Column
	private String experience_summary;
	
	@Column
	private String image_url;
	
	@Column
	private String names;
	
	@Column
	private String last_names;
	
	@Column
	private String email;
	
	@Column
	private String phone;


}
