package com.exa;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Helloworld {
	static final Logger logg = Logger.getLogger(Helloworld.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		//BasicConfigurator.configure();
		logg.debug("Sample debug message");
		logg.info("Sample info message");
		logg.warn("Sample warn message");
		logg.error("Sample error message");
		logg.fatal("Sample fatal message");
	}

}
