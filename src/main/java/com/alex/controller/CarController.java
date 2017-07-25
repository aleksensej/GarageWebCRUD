package com.alex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alex.model.Car;
import com.alex.service.CarService;

@Controller
public class CarController {
	@Autowired
	private CarService carService;
	
	@RequestMapping("/")
	public String setupForm(Map<String, Object> map){
		Car car = new Car();
		map.put("car", car);
		return "car";
	}
	@RequestMapping(value="/car.do", method=RequestMethod.POST)
	public String doAction(@ModelAttribute Car car, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Car carResult = new Car();
		switch(action.toLowerCase()){ // only in Java7 you can put String in your switch
		case "add":
			carService.add(car);
			carResult = car;
			break;
		case "edit":
			carService.edit(car);
			carResult = car;
			break;
		case "search":
			Car searchedCar = carService.getCar(car.getLicencePlate());
			carResult = searchedCar!=null ? searchedCar : new Car();
			break;
		}
		map.put("car", carResult);
		return "car";
	}
}
