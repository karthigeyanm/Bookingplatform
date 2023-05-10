package com.booking.bookingplatform.dto;

import java.util.Set;

import com.booking.bookingplatform.model.Cinema;
import com.booking.bookingplatform.model.CinemaHall;
import com.booking.bookingplatform.model.ShowSeat;

import lombok.Data;

@Data
public class CinemaHallRequestDto {

	private String name;

	private String totalSeats;


	private ShowRequestDto show;

	private Cinema cinema;
	private Set<ShowSeatRequestDto> showSeat;

}
