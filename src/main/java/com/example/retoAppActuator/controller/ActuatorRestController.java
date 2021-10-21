package com.example.retoAppActuator.controller;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ActuatorRestController {

	@GetMapping("prueba")
	public String getSomething() {
		return "Prueba endpoint";
	}
	
	@GetMapping("/usuario/{id}")
	public String getUser(@PathVariable final int id) {
		return "El usuario introducido es: "+id;
	}
	
	@GetMapping("/usuario/{id}/{nombre}")
	public String getUser(@PathVariable final int id, @PathVariable final String nombre) {
		return "El usuario introducido es: "+id+" y su nombre es:"+nombre;
	}
	
	@GetMapping("/edad/{edad}/{nombre}")
	public String getAge(@PathVariable final int edad, @PathVariable final String nombre) {
		
		if (edad > 18) {
			return "Eres mayor de edad "+nombre;
		} else {
			return "Eres menor de edad "+nombre;
		}
		
	}
	

}
