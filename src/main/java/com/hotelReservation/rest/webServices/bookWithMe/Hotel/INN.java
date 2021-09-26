package com.hotelReservation.rest.webServices.bookWithMe.Hotel;

import com.hotelReservation.rest.shared.HotelTypes;

public class INN implements Hotel {
	public Integer id;	
	public Integer noOfRooms;	
	public String type ;	
	public String name;
	public String abc="sdfdsf";
	
	public INN(Integer id, Integer noOfRooms, String name) {
		super();
		this.id = id;
		this.noOfRooms = noOfRooms;
		this.type =  HotelTypes.INN.value;
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
		return "INN [id=" + id + ", noOfRooms=" + noOfRooms + ", type=" + type + "]";
	}
}
