package com.alex.service;

import com.alex.model.Parking;

public interface ParkingService {
	public void add(Parking parking);
	public void edit(Parking parking);
	public Parking getParking(int parkingNumber);
}
