package com.springbike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbike.model.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
