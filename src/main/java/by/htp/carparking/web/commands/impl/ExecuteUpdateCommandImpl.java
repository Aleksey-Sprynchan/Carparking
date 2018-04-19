package by.htp.carparking.web.commands.impl;

import static by.htp.carparking.web.util.PagePathConstantPool.PAGE_INDEX_FORWARD;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;
import by.htp.carparking.web.commands.BaseCommand;

public class ExecuteUpdateCommandImpl implements BaseCommand {

	private CarService carService;
	private static final String PARAMETER_CAR_LIST = "car_list";
	private static final String PARAMETER_CAR_ID = "car_id";
	private static final String PARAMETER_CAR_MODEL = "model";
	private static final String PARAMETER_CAR_BRAND = "brand";

	public ExecuteUpdateCommandImpl() {
		super();
	}
	

	public void setCarService(CarService carService) {
		this.carService = carService;
	}


	@Override
	public String executeCommand(HttpServletRequest request, HttpServletResponse response) {
		
		int carId = Integer.parseInt(request.getParameter(PARAMETER_CAR_ID));
		String model = request.getParameter(PARAMETER_CAR_MODEL);
		String brand = request.getParameter(PARAMETER_CAR_BRAND);
		Car car = new Car(carId, model, brand);
		carService.updateCar(car);

		List<Car> carList = carService.getCarPark();
		request.setAttribute(PARAMETER_CAR_LIST, carList);
		return PAGE_INDEX_FORWARD;

	}

}
