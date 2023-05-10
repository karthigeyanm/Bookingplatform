package com.booking.bookingplatform.dto;

import java.util.Set;

import com.booking.bookingplatform.model.CinemaHall;

import lombok.Data;

@Data
public class CinemaRequestDto {

	private String name;

	private int totalCinemaHalls;

	private Set<CinemaHall> cinemaHall;

	private CityRequestDto city;

}
