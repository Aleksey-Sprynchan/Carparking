package by.htp.carparking.service;

import java.util.List;

import by.htp.carparking.domain.Car;

public interface CarService {
	
	List<Car> getCarPark();
	
	void addCar(Car car);
	
	Car getCar(int id);

	void deleteCar(int id);
	
	void updateCar(Car car);

}
