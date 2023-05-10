package com.booking.bookingplatform.dto;

import lombok.Data;

@Data
public class PaymentRequestDto {

	
	private Integer paymentId;
	
	private BookingRequestDto booking;
}
