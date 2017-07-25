package com.alex.dao;

import com.alex.model.Parking;

public interface ParkingDao {
	public void add(Parking parking);
	public void edit(Parking parking);
	public Parking getParking(int parkingNumber);
}
