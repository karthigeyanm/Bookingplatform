package com.booking.bookingplatform.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.booking.bookingplatform.dto.CinemaHallResponseDto;
import com.booking.bookingplatform.service.CinemasService;

@RestController()
@RequestMapping(value="/cinemas")
public class CinemaController {
	@Autowired
	CinemasService cinemasService;

	@GetMapping("/search")
	private ResponseEntity<CinemaHallResponseDto> getCinemaHallData(@RequestParam(value="movieName",required=false) String movieName,
			@RequestParam(value="date",required=false) Date date, @RequestParam(value="city",required=false) String cityName) {
		CinemaHallResponseDto cinemaHallResponseDto = cinemasService.getCinemaHallData(movieName, date, cityName);
		return ResponseEntity.ok(cinemaHallResponseDto);
	}

}
