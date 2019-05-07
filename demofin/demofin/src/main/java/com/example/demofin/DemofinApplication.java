package com.example.demofin;

import java.io.File;
import java.io.IOException;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;



@SpringBootApplication
public class DemofinApplication implements ApplicationRunner{
	
	
	private static final Logger logger = LogManager.getLogger(DemofinApplication.class);

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemofinApplication.class, args);
	}


	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
		System.out.println("CHECKING DEBUGGER");
        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
    }

}
