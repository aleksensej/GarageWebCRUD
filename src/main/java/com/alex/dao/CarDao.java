package com.alex.dao;

import com.alex.model.Car;

public interface CarDao {
	public void add(Car car);
	public void edit(Car car);
	public Car getCar(String carLicencePlate);
}
