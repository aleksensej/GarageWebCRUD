package com.alex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alex.dao.CarDao;
import com.alex.model.Car;
import com.alex.service.CarService;
@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDao carDao;
	
	@Transactional
	public void add(Car car) {
		carDao.add(car);

	}

	@Transactional
	public void edit(Car car) {
		carDao.edit(car);

	}

	@Transactional
	public Car getCar(String carLicencePlate) {
		return carDao.getCar(carLicencePlate);
	}

}
