package com.booking.bookingplatform.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="SHOW_SEAT")
public class ShowSeat {
	@Id
	@SequenceGenerator(name = "id_showseat_seq",sequenceName ="id_showseat_seq" ,allocationSize=1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="SHOW_SEAT_ID")
	private Integer showSeatId;
	
	@Column(name="price")
	private Integer price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CINEMA_HALL")
	private CinemaHall cinemaHall;
	
}
