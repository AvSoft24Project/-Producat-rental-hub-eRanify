package com.example.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.management.model.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Integer>{

}
