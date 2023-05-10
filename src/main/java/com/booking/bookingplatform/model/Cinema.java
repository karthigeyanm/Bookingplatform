package com.booking.bookingplatform.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Table(name="CINEMA")
@Entity
public class Cinema {
	
	@Id
	@SequenceGenerator(name = "id_cinema_seq",sequenceName ="id_cinema_seq" ,allocationSize=1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="CINEMA_ID")
	private int cinemaId;
	
	@Column(name="NAME")
	private String name;

	@Column(name="TOTAL_CINEMA_HALLS")
	private int totalCinemaHalls;

	@OneToMany(mappedBy = "cinema",cascade = CascadeType.ALL)
	private Set<CinemaHall> cinemaHall;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CITY_ID")
	private City city;
	
	
}
