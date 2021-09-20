package com.hotelReservation.rest.webServices.bookWithMe.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VillaNotFoundException extends RuntimeException {

	public VillaNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
