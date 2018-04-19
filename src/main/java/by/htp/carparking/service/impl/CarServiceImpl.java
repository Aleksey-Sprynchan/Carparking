package by.htp.carparking.service.impl;

import java.util.List;

import by.htp.carparking.dao.BaseDao;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;


public class CarServiceImpl implements CarService {

	private BaseDao<Car> carDbDao;

	public CarServiceImpl() {
	}
	

	public void setCarDbDao(BaseDao<Car> carDbDao) {
		this.carDbDao = carDbDao;
	}


	@Override
	public List<Car> getCarPark() {

		List<Car> carList = carDbDao.readAll();
		return carList;
	}

	@Override
	public void addCar(Car car) {
		carDbDao.create(car);
	}


	@Override
	public Car getCar(int id) {		
		return (Car)carDbDao.read(id);		
	}
	
	@Override
	public void deleteCar(int id) {		
		carDbDao.delete(id);		
	}

	@Override
	public void updateCar(Car car) {		
		carDbDao.update(car);		
	}
	
	
}
