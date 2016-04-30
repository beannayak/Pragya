package com.workout.webservices.domain;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Set {
	@Id
	@GeneratedValue
	private int id;
	
	@ElementCollection
	private List<Integer> rep;
}
