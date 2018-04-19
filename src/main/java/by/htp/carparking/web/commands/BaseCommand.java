package by.htp.carparking.web.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface BaseCommand {
	
	 String executeCommand (HttpServletRequest request, HttpServletResponse response);
	 
}
