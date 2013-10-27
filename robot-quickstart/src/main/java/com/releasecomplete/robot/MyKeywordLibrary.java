package com.releasecomplete.robot;

public class MyKeywordLibrary {

	/** 
     *  Means that that this instance of the class well be used
     *  for whole lifecycle of test execution.
     */
    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
	
	public String hello(String name) {
		return "Hi " + name;
	}
	
}
