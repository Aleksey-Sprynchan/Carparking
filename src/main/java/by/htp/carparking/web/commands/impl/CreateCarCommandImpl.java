package by.htp.carparking.web.commands.impl;

import static by.htp.carparking.web.util.PagePathConstantPool.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.htp.carparking.web.commands.BaseCommand;

public class CreateCarCommandImpl implements BaseCommand {
	
	
	public CreateCarCommandImpl() {
		super();
	}

	@Override
	public String executeCommand(HttpServletRequest request, HttpServletResponse response) {		
		return PAGE_CREATE_CAR;
	}

}
