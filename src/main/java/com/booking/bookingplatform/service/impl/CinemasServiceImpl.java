package com.booking.bookingplatform.service.impl;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.booking.bookingplatform.dto.CinemaHallResponseDto;
import com.booking.bookingplatform.model.CinemaHall;
import com.booking.bookingplatform.repository.CinemaRespository;
import com.booking.bookingplatform.service.CinemasService;

@Service
public class CinemasServiceImpl implements CinemasService {

	@Autowired
	CinemaRespository cinemaRespository;
	

	@Override
	public CinemaHallResponseDto getCinemaHallData(String movieName, Date date, String cityName) {
		ModelMapper mapper=new ModelMapper();
	CinemaHall cinemaHall= 	cinemaRespository.getCinemaHallData( movieName,  date,  cityName);
		return mapper.map(cinemaHall, CinemaHallResponseDto.class);
	}

}
