package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Hotel;
import com.service.HotelService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin("*")
@RestController
@Tag(name="Servicio de hoteles", description="Servicio de consulta de hoteles")
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@GetMapping(value="/hoteles-disponibles",produces=MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary="Busca todos los hoteles disponibles", description="Busca todos los hoteles disponibles. No recibe parámetros")
	List<Hotel> buscaDisponibles(){
		return hotelService.findDisponibles();
	}
	
	@GetMapping("/hotel/{nombre}")
	@Operation(summary="Busca un hotel por nombre", description="Busca un hotel con nombre coincidente con el recibido")
	Hotel buscaPorNombre(@Parameter(name="nombre", description = "Nombre del hotel a buscar") @PathVariable String nombre) {
		return hotelService.findPorNombre(nombre);
	}
}
