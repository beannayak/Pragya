package com.workout.webservices.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Day {
	@Id
	@GeneratedValue
	private long id;
	
	@OneToOne
	private Exercise exercise;
	
	@OneToMany
	private List<Set> sets;
}
