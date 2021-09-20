package com.hotelReservation.rest.webServices.bookWithMe.Hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

	@Autowired
	private HotelDaoService hotelDaoService;
		
	public HotelController(HotelDaoService hotelDaoService) {
		super();
		this.hotelDaoService = hotelDaoService;
	}


	@GetMapping("/hotel-list")
	public List<Villa> getAllHotels() {
		return hotelDaoService.getAllHotels();
	}
	
	@GetMapping("/hotel-list/{id}")
	public Villa getHotel(@PathVariable String id) {
		return hotelDaoService.findHotel(Integer.parseInt(id));
	}
	
}
