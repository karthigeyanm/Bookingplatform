package com.booking.bookingplatform.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="PAYMENT")
public class Payment {

	
	@Id
	@SequenceGenerator(name = "payment_id_seq",sequenceName = "payment_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private Integer paymentId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="BOOKING_ID",referencedColumnName = "BOOKING_ID")
	private Booking booking;
}
