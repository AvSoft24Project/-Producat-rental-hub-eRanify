package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
