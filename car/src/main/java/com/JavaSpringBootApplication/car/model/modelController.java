package com.JavaSpringBootApplication.car.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class modelController {
	
	@RequestMapping("/hello")
	public List<carModel> getAllCars() {
		return Arrays.asList(
				new carModel("Axia", "Perodua"),
				new carModel("Bezza", "Perodua"),
				new carModel("Civic", "Honda"),
				new carModel("City", "Honda"),
				new carModel("Saga", "Proton"),
				new carModel("Persona", "Proton")
				);
	}
}
