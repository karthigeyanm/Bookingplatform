package com.booking.bookingplatform.service;

import java.util.Date;

import com.booking.bookingplatform.dto.CinemaHallResponseDto;

public interface CinemasService {

	CinemaHallResponseDto getCinemaHallData(String movieName, Date date, String cityName);

}
