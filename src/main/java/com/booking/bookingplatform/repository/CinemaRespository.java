package com.booking.bookingplatform.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.booking.bookingplatform.model.CinemaHall;

public interface CinemaRespository extends JpaRepository<CinemaHall, Integer> {

	@Query(value="select ch from CINEMA_HALL ch inner join CINEMA c on c.CINEMA_ID =ch.CINEMA_ID inner join CITY ci on c.CITY_ID= ci.CITY_ID inner join SHOW s on s.CINEMA_HALL_ID=ch.CINEMA_HALL_ID inner join MOVIE m on m.MOVIE_ID=s.MOVIE_ID where m.TITLE=:movieName and s.DATE=:date and ci.NAME=:cityName",nativeQuery = true)
	CinemaHall getCinemaHallData(String movieName, Date date, String cityName);

}
