package com.booking.bookingplatform.model;

import java.util.Date;
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

@Table(name="SHOW")
@Entity
public class Show {
	@Id
	@SequenceGenerator(name = "id_show_seq",sequenceName ="id_show_seq" ,allocationSize=1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="SHOW_ID")
	private int showId;
	
	@Column(name="DATE")
	private Date date;
	
	@Column(name="START_TIME")
	private Date startTime ;

	
	@Column(name="END_TIME")
	private Date endTime ;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CINEMA_HALL_ID",referencedColumnName = "CINEMA_HALL_ID")
	private CinemaHall  cinemaHall ;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "show")
	private Set<Booking> booking;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MOVIE_ID")
	private Movie movie;

}
