package com.booking.bookingplatform.dto;

import java.util.Set;

import lombok.Data;

@Data
public class CityRequestDto {
	
	private String 	name;
	
	private Set<CinemaRequestDto> cinema;
}
