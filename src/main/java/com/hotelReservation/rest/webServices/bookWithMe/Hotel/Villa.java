package com.hotelReservation.rest.webServices.bookWithMe.Hotel;

import com.hotelReservation.rest.shared.HotelTypes;

public class Villa {

	public Integer id;	
	public Integer noOfRooms;	
	public String type ;	
	public String name;
	
	public Villa(Integer id, Integer noOfRooms, String name) {
		super();
		this.id = id;
		this.noOfRooms = noOfRooms;
		this.type = HotelTypes.VILLA;
		this.name = name;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Villa [id=" + id + ", noOfRooms=" + noOfRooms + ", type=" + type + "]";
	}
	
	
}
