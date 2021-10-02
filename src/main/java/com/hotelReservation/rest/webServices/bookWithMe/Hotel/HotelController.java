package com.hotelReservation.rest.webServices.bookWithMe.Hotel;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hotelReservation.rest.webServices.bookWithMe.Exception.HotelNotFoundException;
import com.hotelReservation.rest.webServices.bookWithMe.Exception.VillaNotFoundException;

@RestController
public class HotelController {

	@Autowired
	private HotelDaoService hotelDaoService;
		
	public HotelController(HotelDaoService hotelDaoService) {
		super();
		this.hotelDaoService = hotelDaoService;
	}


	@GetMapping("/hotel")
	public List<Hotel> getAllHotels() {
		return hotelDaoService.getAllHotels();
	}
	
	@GetMapping("/hotel/{id}")
	public Hotel getHotel(@PathVariable String id) {
		Hotel hotel = hotelDaoService.findHotel(Integer.parseInt(id));
		if (hotel != null) {
			return hotel;
		} else {
			throw new HotelNotFoundException("id-" + id);
		}
	}
	
	@PostMapping("/hotel")
	public ResponseEntity createHotel(@RequestBody Hotel hotel) {
		//hotel factory should come here
		Hotel savedVilla = hotelDaoService.save(hotel);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedVilla.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/hotel/{id}")
	public void deleteHotel(@PathVariable String id) {
		Hotel hotel = hotelDaoService.deleteByID(Integer.parseInt(id));
		
		if(hotel == null) {
			throw new HotelNotFoundException("id-" + id);
		}
	}
}
