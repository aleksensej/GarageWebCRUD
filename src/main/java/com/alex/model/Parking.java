package com.alex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parking {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int parkingNumber;
	@Column
	private int levelNumber;
	@Column
	private String licencePlate;
	
	public Parking(){}
	public Parking(int levelNumber, int parkingNumber) {
		super();
		this.levelNumber = levelNumber;
		this.parkingNumber = parkingNumber;
	}
	public int getLevelNumber() {
		return levelNumber;
	}
	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}
	public int getParkingNumber() {
		return parkingNumber;
	}
	public void setParkingNumber(int parkingNumber) {
		this.parkingNumber = parkingNumber;
	}
	public String getLicencePlate() {
		return licencePlate;
	}
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}
}
