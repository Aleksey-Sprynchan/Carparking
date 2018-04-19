package by.htp.carparking.web.commands.impl;

import static by.htp.carparking.web.util.PagePathConstantPool.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;
import by.htp.carparking.service.impl.CarServiceImpl;
import by.htp.carparking.web.commands.BaseCommand;

public class UpdateCarCommandImpl implements BaseCommand {
	
	private CarService carService;
	private static final String PARAMETER_CAR_ID = "car_id";
	private static final String PARAMETER_EDIT_CAR = "edit_car";
	
	
	public UpdateCarCommandImpl() {
		super();
	}


	public void setCarService(CarService carService) {
		this.carService = carService;
	}


	@Override
	public String executeCommand(HttpServletRequest request, HttpServletResponse response) {
		
		int carId = Integer.parseInt(request.getParameter(PARAMETER_CAR_ID));
		System.out.println(carId);
		Car editCar = carService.getCar(carId);
		request.setAttribute(PARAMETER_EDIT_CAR, editCar);
		return PAGE_EDIT_CAR;
	}

}
