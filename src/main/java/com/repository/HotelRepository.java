package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	@Query("SELECT h FROM Hotel h WHERE h.disponible = 'S'")
	List<Hotel> findDisponibles();
	
	@Query("SELECT h FROM Hotel h WHERE h.nombre = ?1") 
	Hotel findByNombre(String nombre);

}
