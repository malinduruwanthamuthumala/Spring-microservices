package com.hotelReservation.rest.shared;

public enum HotelTypes {

	VILLA("VILLA"),
	RESTAURENT("RESTAURENT"),
	MOTEL("MOTEL"),
	CAFE("CAFE"),
	BEACHHOTEL("BEACHHOTEL"),
	BOUTIQUE("BOUTIQUE"),
	INN("INN");

	
    public final String value;

    private HotelTypes(String label) {
        this.value = label;
    }
    
   
	
}
