package com.alex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@Column
	private String licencePlate;
	@Column
	private String carType;
	@Column
	private boolean isParked;
	
	public Car (){}
	public Car(String licencePlate, String carType) {
		super();
		this.licencePlate = licencePlate;
		this.carType = carType;
	}
	public String getLicencePlate() {
		return licencePlate;
	}
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public boolean isParked() {
		return isParked;
	}
	public void setParked(boolean isParked) {
		this.isParked = isParked;
	}
}
