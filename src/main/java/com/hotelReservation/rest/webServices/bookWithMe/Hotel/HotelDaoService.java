package com.hotelReservation.rest.webServices.bookWithMe.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class HotelDaoService {

	private static List<Hotel> listOfHotel = new ArrayList<Hotel>();
	private static Integer hotelcounter = 10;

	static {
		listOfHotel.add(new Villa(1, 10, "Blue Beach"));
		listOfHotel.add(new Villa(2, 14, "Eden garden"));
		listOfHotel.add(new Villa(3, 17, "serenity"));
		listOfHotel.add(new Villa(4, 11, "Hotel island"));
		listOfHotel.add(new Villa(5, 10, "mango shade"));
		listOfHotel.add(new Villa(6, 3, "mountain breez"));
		listOfHotel.add(new Villa(7, 1, "Honey club"));
		listOfHotel.add(new Villa(8, 10, "todays"));
		listOfHotel.add(new Villa(9, 14, "seven season"));
		listOfHotel.add(new Villa(10, 10, "nirluu"));
	}

	public List<Hotel> getAllHotels() {
		return listOfHotel;
	}

	public Hotel save(Hotel hotel) {
		if (hotel.getId() == null) {
			hotel.setId(++hotelcounter);
		}
		listOfHotel.add(hotel);
		return hotel;
	}

	public Hotel findHotel(Integer id) {
		List<Hotel> hotel = null;

		if (id != null) {
			hotel = listOfHotel.stream().filter(v -> v.getId() == id).collect(Collectors.toList());
			if (!CollectionUtils.isEmpty(hotel)) {
				return hotel.get(0);
			} else
				return null;
		} else {
			return null;
		}
	}

}
