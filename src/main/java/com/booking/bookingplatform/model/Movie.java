package com.booking.bookingplatform.model;

import java.util.Date;
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

@Table(name="MOVIE")
@Entity
public class Movie {
	
	@Id
	@SequenceGenerator(name = "id_movie_seq",sequenceName ="id_movie_seq" ,allocationSize=1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="MOVIE_ID")
	private int movieId;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="RELEASE_DATE")
	private Date releaseDate;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="GENRE")
	private String genre;
	
	@OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
	private  Set<Show> show; 
	

}
