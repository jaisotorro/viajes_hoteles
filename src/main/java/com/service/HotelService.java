package com.service;

import java.util.List;

import com.model.Hotel;

public interface HotelService {
	
	List<Hotel> findDisponibles();
	Hotel findPorNombre(String nombre);
}
