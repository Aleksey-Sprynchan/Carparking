package by.htp.carparking.web.commands.impl;

import static by.htp.carparking.web.util.PagePathConstantPool.*;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;
import by.htp.carparking.web.commands.BaseCommand;


public class IndexForwardCommandImpl implements BaseCommand{

	
	private CarService carService;
	private static final String PARAMETER_CAR_LIST = "car_list";

	public IndexForwardCommandImpl() {
		
	}

	public void setCarService(CarService carService) {
		this.carService = carService;
	}


	@Override
	public String executeCommand(HttpServletRequest request, HttpServletResponse respons) {

		List<Car> carList = carService.getCarPark();
		request.setAttribute(PARAMETER_CAR_LIST, carList);
		return PAGE_INDEX_FORWARD;
	
	}


	

}
