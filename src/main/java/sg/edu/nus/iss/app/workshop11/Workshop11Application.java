package sg.edu.nus.iss.app.workshop11;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop11Application {

	//Logger is to help trace errors. Since import Logger is using slf4j library, we need to use slf4j bindings (hence, LoggerFactory.getLogger()).
	//If 'import org.apache.log4j.Logger' is used, then use Logger.getLogger().
	private static final Logger logger = LoggerFactory.getLogger(Workshop11Application.class);
	private static String portNumber = null;
	private static final String DEFAULT_PORT = "8080";

	public static void main(String[] args) {
		for (String argVal : args){
		logger.debug ("argVal : "+ argVal);
		if(argVal.contains("--port=")){
			portNumber = argVal.substring(argVal.length()-4, argVal.length());
			logger.debug ("portNumber : "+ portNumber);
		}
		}

		if (portNumber == null){
			portNumber = System.getenv("APP_PORT"); //export APP_PORT=8090
			logger.debug("Sys Env portNumber : " + portNumber);
		}

		if (portNumber == null){
			portNumber = DEFAULT_PORT;
		}
		

		//SpringApplication.run(Workshop11Application.class, args);
		SpringApplication app = new SpringApplication(Workshop11Application.class);
		//Set the port to listen before starting the application
		app.setDefaultProperties(Collections.singletonMap("server.port", portNumber));
		app.run(args);

	}

}
