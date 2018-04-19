package by.htp.carparking.web.util;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.web.commands.BaseCommand;
import by.htp.carparking.web.commands.impl.CreateCarCommandImpl;
import by.htp.carparking.web.commands.impl.DeleteCarCommandImpl;
import by.htp.carparking.web.commands.impl.ExecuteCreateCommandImpl;
import by.htp.carparking.web.commands.impl.ExecuteUpdateCommandImpl;
import by.htp.carparking.web.commands.impl.IndexForwardCommandImpl;
import by.htp.carparking.web.commands.impl.UpdateCarCommandImpl;

public class CommandFactory {
	
	private static final String COMMAND = "command";

	public static BaseCommand defineCommand(HttpServletRequest request) {
		
		BaseCommand command = null;
		
		String inputCommand =  request.getParameter(COMMAND);
		
		CommandEnum commandName = CommandEnum.valueOf(inputCommand);
		
		System.out.println(inputCommand);
		
		switch(commandName) {
		case EXECUTE_CREATE:
			command = new ExecuteCreateCommandImpl();
			break;
		case CREATE_CAR:
			command = new CreateCarCommandImpl();
			break;
		case EXECUTE_UPDATE:
			command = new ExecuteUpdateCommandImpl();
			break;
		case UPDATE_CAR:
			command = new UpdateCarCommandImpl();
			break;
		case DELETE_CAR:
			command = new DeleteCarCommandImpl();
			break;
		case INDEX_FORWARD:
			command = new IndexForwardCommandImpl();
			break;
		}
		return command;

	}
}
