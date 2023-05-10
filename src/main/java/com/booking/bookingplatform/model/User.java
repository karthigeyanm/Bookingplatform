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

@Table(name="USER")
@Entity
public class User {
	@Id
	@SequenceGenerator(name = "id_user_seq",sequenceName ="id_user_seq" ,allocationSize=1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE_NO")
	private Integer phoneNo;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private Set<Booking> booking;

	
}
