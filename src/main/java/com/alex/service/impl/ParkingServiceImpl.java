package com.alex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.dao.ParkingDao;
import com.alex.model.Parking;
import com.alex.service.ParkingService;
@Service
public class ParkingServiceImpl implements ParkingService {
	@Autowired
	private ParkingDao parkingDao;
	
	@Override
	public void add(Parking parking) {
		parkingDao.add(parking);

	}

	@Override
	public void edit(Parking parking) {
		parkingDao.edit(parking);

	}

	@Override
	public Parking getParking(int parkingNumber) {
		return parkingDao.getParking(parkingNumber);
	}

}
