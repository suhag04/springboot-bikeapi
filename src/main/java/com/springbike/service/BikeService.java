package com.springbike.service;

import java.util.List;

import com.springbike.model.Bike;

public interface BikeService {

	public List<Bike> getAllBikes();

	public Bike getBikeById(long id);

	public void saveBike(Bike bike);
	
	public void deleteBike(long id);

}
