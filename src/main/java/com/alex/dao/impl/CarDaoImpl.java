package com.alex.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alex.dao.CarDao;
import com.alex.model.Car;

@Repository
public class CarDaoImpl implements CarDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Car car) {
		session.getCurrentSession().save(car);

	}

	@Override
	public void edit(Car car) {
		session.getCurrentSession().update(car);

	}

	@Override
	public Car getCar(String carLicencePlate) {
		return (Car)session.getCurrentSession().get(Car.class, carLicencePlate);
	}

}
