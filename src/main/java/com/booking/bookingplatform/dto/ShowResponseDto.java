package com.booking.bookingplatform.dto;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ShowResponseDto extends ShowRequestDto {
	private int showId;
	
	
}
