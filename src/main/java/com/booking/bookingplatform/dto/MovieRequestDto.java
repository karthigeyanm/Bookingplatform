package com.booking.bookingplatform.dto;

import java.util.Date;
import java.util.Set;

import lombok.Data;

@Data
public class MovieRequestDto {


	private String title;

	private String description;

	private String language;

	private Date releaseDate;

	private String country;

	private String genre;
	
	Set<ShowRequestDto> show;

}
