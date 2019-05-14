package com.example.demofin;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;



@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class DemofinApplication{
	
	
	private static final Logger logger = LogManager.getLogger(DemofinApplication.class);

	public static void main(String[] args)  {
		SpringApplication.run(DemofinApplication.class, args);
	}



//	@Override
//    public void run(ApplicationArguments applicationArguments) throws Exception {
//		System.out.println("CHECKING DEBUGGER");
//        logger.debug("Debugging log");
//        logger.info("Info log");
//        logger.warn("Hey, This is a warning!");
//        logger.error("Oops! We have an Error. OK");
//        logger.fatal("Damn! Fatal error. Please fix me.");
//    }

}
