package com.example.demofin;

import java.io.File;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demofin.config.Properties;

@Component
public class Demofin implements CommandLineRunner {
	
	@Autowired
	private Properties properties;

	@Override
	public void run(String... args) throws Exception {
	
		 
		   String j = properties.getPropertyByKey("JMETER_HOME");
		   System.out.println(j);
		   
		   //System.out.println("Jmeter home path: " + properties.getPropertyByKey("JMETER_HOME"));
		  
		   StandardJMeterEngine jmeter = new StandardJMeterEngine();  
		   
		   
		     // Initialize Properties, logging, locale, etc.  
		    
		     JMeterUtils.setJMeterHome(j);
		     JMeterUtils.loadJMeterProperties(j+"/bin/jmeter.properties");
		    
		     // you can comment this line out to see extra log messages of i.e. DEBUG level  
		     JMeterUtils.initLogging();  
		     JMeterUtils.initLocale();  
		   
		     
		   
		     // Initialize JMeter SaveService  
		     SaveService.loadProperties();  
		   
		     // Load existing .jmx Test Plan  
		     HashTree testPlanTree = SaveService.loadTree(new File("D:\\apache-jmeter-4.0\\" + "bin\\ViewResultsTree.jmx"));  

		             
		     Summariser summer = null;  
		     String summariserName = JMeterUtils.getPropDefault("summariser.name", "summary");  
		   
		     if (summariserName.length() > 0) {  
		       summer = new Summariser(summariserName);  
		     }  
		   
		     ResultCollector logger = new ResultCollector(summer);  
		     testPlanTree.add(testPlanTree.getArray()[0], logger);  
		   
		     // Run JMeter Test  
		     jmeter.configure(testPlanTree);  
		     jmeter.run();  

	}

	
}
