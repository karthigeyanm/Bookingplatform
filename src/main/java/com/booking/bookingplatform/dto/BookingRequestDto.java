package com.booking.bookingplatform.dto;

import lombok.Data;

@Data
public class BookingRequestDto {
	
	private UserRequestDto user;
	
	private ShowRequestDto show;
	
	private PaymentRequestDto payment;
}
