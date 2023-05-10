package com.booking.bookingplatform.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MovieResponseDto extends MovieRequestDto {
	
	private int movieId;
	

}
