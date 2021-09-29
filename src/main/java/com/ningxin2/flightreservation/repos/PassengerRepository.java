package com.ningxin2.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ningxin2.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
	
}
