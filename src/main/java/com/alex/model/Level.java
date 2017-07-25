package com.alex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Level {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int levelNumber;
	@Column
	private int parkinglimit;
	
	public Level(){}
	public Level(int levelNumber, int parkinglimit) {
		super();
		this.levelNumber = levelNumber;
		this.parkinglimit = parkinglimit;
	}
	public int getLevelNumber() {
		return levelNumber;
	}
	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}
	public int getParkinglimit() {
		return parkinglimit;
	}
	public void setParkinglimit(int parkinglimit) {
		this.parkinglimit = parkinglimit;
	}
}
