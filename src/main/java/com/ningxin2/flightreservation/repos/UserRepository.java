package com.ningxin2.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ningxin2.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	//Spring will automatically generate a SQL query for us: "Select * from user where email = @email"
	User findByEmail(String email);
	
}
