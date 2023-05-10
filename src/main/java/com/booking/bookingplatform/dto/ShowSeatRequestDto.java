package com.booking.bookingplatform.dto;

import lombok.Data;

@Data
public class ShowSeatRequestDto {
	private Integer price;
	
	private CinemaHallRequestDto cinemaHall;
	
}
