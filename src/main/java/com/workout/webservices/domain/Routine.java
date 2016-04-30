package com.workout.webservices.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Routine {
	@Id
	@GeneratedValue
	private long id;
	
	@OneToMany
	private List<Day> days;
	
	@ManyToMany
	private List<Person> persons;
}
