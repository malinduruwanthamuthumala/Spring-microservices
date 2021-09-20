package com.hotelReservation.rest.webServices.bookWithMe.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class HotelDaoService {

	private static List<Villa> listOfVillas = new ArrayList<Villa>();
	private static Integer hotelcounter = 10;

	static {
		listOfVillas.add(new Villa(1, 10, "Blue Beach"));
		listOfVillas.add(new Villa(2, 14, "Eden garden"));
		listOfVillas.add(new Villa(3, 17, "serenity"));
		listOfVillas.add(new Villa(4, 11, "Hotel island"));
		listOfVillas.add(new Villa(5, 10, "mango shade"));
		listOfVillas.add(new Villa(6, 3, "mountain breez"));
		listOfVillas.add(new Villa(7, 1, "Honey club"));
		listOfVillas.add(new Villa(8, 10, "todays"));
		listOfVillas.add(new Villa(9, 14, "seven season"));
		listOfVillas.add(new Villa(10, 10, "nirluu"));
	}

	public List<Villa> getAllHotels() {
		return listOfVillas;
	}

	public Villa save(Villa villa) {
		if (villa.getId() == null) {
			villa.setId(++hotelcounter);
		}
		listOfVillas.add(villa);
		return villa;
	}

	public Villa findHotel(Integer id) {
		List<Villa> villa = null;

		if (id != null) {
			villa = listOfVillas.stream().filter(v -> v.getId() == id).collect(Collectors.toList());
			if (!CollectionUtils.isEmpty(villa)) {
				return villa.get(0);
			} else
				return null;
		} else {
			return null;
		}
	}

}
