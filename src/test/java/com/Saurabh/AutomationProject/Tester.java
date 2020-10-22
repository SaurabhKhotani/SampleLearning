package com.Saurabh.AutomationProject;

import java.io.IOException;

import com.Saurabh.AutomationProject.Utilities.HelperClass;

public class Tester extends HelperClass{

	public static void main(String[] args) {
		 
		HelperClass hC=new HelperClass();
		try {
			hC.initializeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
