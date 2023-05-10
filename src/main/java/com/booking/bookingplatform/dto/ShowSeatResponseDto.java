package com.booking.bookingplatform.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ShowSeatResponseDto extends ShowRequestDto {
	private Integer showSeatId;
	
	
}
