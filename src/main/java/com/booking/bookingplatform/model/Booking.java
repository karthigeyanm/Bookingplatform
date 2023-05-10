package com.booking.bookingplatform.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="BOOKING")
@Entity
public class Booking {

	@Id
	@SequenceGenerator(name = "booking_id_seq",sequenceName = "booking_id_seq")
	@GeneratedValue(strategy  =GenerationType.SEQUENCE)
	@Column(name="BOOKING_ID")
	private Integer bookingId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="SHOW_ID")
	private Show show;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "booking")
	private Payment payment;
}
