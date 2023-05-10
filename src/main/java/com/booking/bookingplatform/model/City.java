package com.booking.bookingplatform.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="CITY")
@Entity
public class City {
	@Id
	@SequenceGenerator(name = "id_cinemahall_seq",sequenceName ="id_cinemahall_seq" ,allocationSize=1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="CITY_ID")
	private int movieId;
	
	@Column(name="NAME")
	private String 	name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
	private Set<Cinema> cinema;
}
