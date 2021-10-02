package com.hotelReservation.rest.webServices.bookWithMe.Exception;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timestamp;
	private String fields;
	private String details;
	
	public ExceptionResponse(Date timestamp, String fields, String details) {
		super();
		this.timestamp = timestamp;
		this.fields = fields;
		this.details = details;
	}

	

	public Date getTimestamp() {
		return timestamp;
	}

	public String getFields() {
		return fields;
	}

	public String getDetails() {
		return details;
	}
	
	
}
