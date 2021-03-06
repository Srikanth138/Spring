package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("per1") //is nothing but reference of object
@ToString

//@PropertySource(value = "com/nt/commons/myfile.properties")
/*@PropertySource(value = {"com/nt/commons/myfile.properties",
		                                       "com/nt/commons/myfile1.properties"})*/

/*@PropertySources(value= { @PropertySource(value="com/nt/commons/myfile.properties"),
		                                        @PropertySource(value="com/nt/commons/myfile1.properties")
                                  })*/
@PropertySource(value="com/nt/commons/myfiles.properties")
@PropertySource(value="com/nt/commons/myfiles1.properties")
public class Person1 {
	@Value("${per.id}")  //key in properties file
	private int pid;
	@Value("${per.name}")  //key in properties file
	private String pname;
	@Value("${per.age}")  //key in properties file
	private  float age;
	
	@Value("${os.name}")  //system property
	private String os;
	
	@Value("${path}")  //env.. variable value  (Path is case-sensitive)
	private String path;

}
