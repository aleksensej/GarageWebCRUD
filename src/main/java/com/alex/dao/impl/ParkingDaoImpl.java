package com.alex.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alex.dao.ParkingDao;
import com.alex.model.Parking;

@Repository
public class ParkingDaoImpl implements ParkingDao {
	@Autowired
	private SessionFactory session;
	@Override
	public void add(Parking parking) {
		session.getCurrentSession().save(parking);

	}

	@Override
	public void edit(Parking parking) {
		session.getCurrentSession().update(parking);

	}

	@Override
	public Parking getParking(int parkingNumber) {
		return (Parking)session.getCurrentSession().get(Parking.class, parkingNumber);
	}

}
