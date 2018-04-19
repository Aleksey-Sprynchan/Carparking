package by.htp.carparking.web.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.WebApplicationContext;

import by.htp.carparking.web.commands.BaseCommand;

public class ActionManagerContext {

	public ActionManagerContext() {	}
	
	public static BaseCommand defineCommand(HttpServletRequest request, 
			WebApplicationContext webApplicationContext) {
		return (BaseCommand) webApplicationContext.getBean(request.getParameter("command"));
	}

}
