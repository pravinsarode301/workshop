package com.lab.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.lab.poc.dto.User;

@Repository
public interface UserRespositiry extends JpaRepository<User, Integer> {

}
