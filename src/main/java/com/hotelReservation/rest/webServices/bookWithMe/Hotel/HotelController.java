package com.hotelReservation.rest.webServices.bookWithMe.Hotel;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	public List<Villa> getAllHotels() {
		return hotelDaoService.getAllHotels();
	}
	
	@GetMapping("/hotel/{id}")
	public Villa getHotel(@PathVariable String id) {
		Villa villa = hotelDaoService.findHotel(Integer.parseInt(id));
		if (villa != null) {
			return villa;
		} else {
			throw new VillaNotFoundException("id-" + id);
		}
	}
	
	@PostMapping("/hotel")
	public ResponseEntity createHotel(@RequestBody Villa villa) {
		Villa savedVilla = hotelDaoService.save(villa);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedVilla.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
}
