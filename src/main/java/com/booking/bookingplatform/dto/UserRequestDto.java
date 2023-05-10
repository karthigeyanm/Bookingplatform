package com.booking.bookingplatform.dto;

import java.util.Set;

import lombok.Data;

@Data
public class UserRequestDto {

	private String name;

	private String password;

	private String email;

	private Integer phoneNo;

	private Set<BookingRequestDto> booking;

}
