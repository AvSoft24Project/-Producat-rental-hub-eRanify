package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
