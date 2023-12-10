package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Hotel;
import com.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public List<Hotel> findDisponibles() {
		return hotelRepository.findDisponibles();
	}

	@Override
	public Hotel findPorNombre(String nombre) {
		return hotelRepository.findByNombre(nombre);
	}
}
