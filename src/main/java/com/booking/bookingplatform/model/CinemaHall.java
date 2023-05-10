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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Table(name="CINEMA_HALL")
@Entity
public class CinemaHall {
	@Id
	@SequenceGenerator(name = "id_cinemahall_seq",sequenceName ="id_cinemahall_seq" ,allocationSize=1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="CINEMA_HALL_ID")
	private int cinemHallId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="TOTAL_SEATS")
	private String totalSeats;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CINEMA_ID")
	private Cinema cinema;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "cinemaHall")
	private  Show show;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cinemaHall")
	private Set<ShowSeat> showSeat;
	
}
