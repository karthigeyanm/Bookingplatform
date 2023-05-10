package com.booking.bookingplatform.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CityResponseDto extends CityRequestDto {
	private int movieId;
	
	private String 	name;
}
