package com.hotelReservation.rest.webServices.bookWithMe.Hotel;

import com.hotelReservation.rest.shared.HotelTypes;

public class Villa implements Hotel{

	public Integer id;	
	public Integer noOfRooms;	
	public String type ;	
	public String name;
	
	public Villa(Integer id, Integer noOfRooms, String name) {
		super();
		this.id = id;
		this.noOfRooms = noOfRooms;
		this.type =  HotelTypes.VILLA.value;
		this.name = name;
	}

	
	@Override
	public String getName() {
		return this.name;
	}
    @Override
	public void setName(String name) {
		this.name = name;
	}
    
    @Override
	public Integer getId() {
		return id;
	}
    @Override
	public void setId(Integer id) {
		this.id = id;
	}

    @Override
	public Integer getNoOfRooms() {
		return noOfRooms;
	}
    @Override
	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
    
    @Override
	public String getType() {
		return type;
	}
    @Override
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Villa [id=" + id + ", noOfRooms=" + noOfRooms + ", type=" + type + "]";
	}


	
	
	
}
