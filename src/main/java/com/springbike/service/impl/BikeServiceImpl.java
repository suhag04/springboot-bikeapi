package com.springbike.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbike.model.Bike;
import com.springbike.repository.BikeRepository;
import com.springbike.service.BikeService;

@Service
public class BikeServiceImpl implements BikeService {

	@Autowired
	private BikeRepository bikeRepository;

	@Override
	public List<Bike> getAllBikes() {
		return bikeRepository.findAll();
	}

	@Override
	public Bike getBikeById(long id) {
		return bikeRepository.getOne(id);
	}

	@Override
	public void saveBike(Bike bike) {
		bikeRepository.save(bike);

	}

	@Override
	public void deleteBike(long id) {
		bikeRepository.deleteById(id);
	}

}
