package com.ningxin2.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ningxin2.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	
}
