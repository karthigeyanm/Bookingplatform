package com.booking.bookingplatform.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserResponseDto extends UserRequestDto{
	private int userId;
	
}
