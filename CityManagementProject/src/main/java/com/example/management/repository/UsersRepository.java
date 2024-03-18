package com.example.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.management.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
