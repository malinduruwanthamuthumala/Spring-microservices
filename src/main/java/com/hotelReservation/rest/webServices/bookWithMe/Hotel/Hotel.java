package com.hotelReservation.rest.webServices.bookWithMe.Hotel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.hotelReservation.rest.shared.HotelTypes;

@JsonTypeInfo(
	    use = JsonTypeInfo.Id.NAME,
	    include = JsonTypeInfo.As.PROPERTY,
	    property = "type")
	@JsonSubTypes({
	    @Type(value = Villa.class, name = "VILLA"),
	    @Type(value = INN.class, name = "INN")
	    })
public interface Hotel {

	public String getName();
	public void setName(String name);
	
	public Integer getId() ;
	public void setId(Integer id);

	public Integer getNoOfRooms();
	public void setNoOfRooms(Integer noOfRooms) ;

	public String getType();
	public void setType(String type);
	
	
}
