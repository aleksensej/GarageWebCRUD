package com.alex.service;

import com.alex.model.Car;

public interface CarService {
	public void add(Car car);
	public void edit(Car car);
	public Car getCar(String carLicencePlate);
}
