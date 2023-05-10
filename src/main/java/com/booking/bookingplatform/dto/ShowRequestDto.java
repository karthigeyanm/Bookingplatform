package com.booking.bookingplatform.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ShowRequestDto {
	
	private Date date;
	
	private Date startTime ;

	
	private Date endTime ;

	
	private CinemaHallRequestDto  cinemaHall ;
	
	private BookingRequestDto booking;
	private MovieRequestDto movie;

}
