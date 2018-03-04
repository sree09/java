package com.rt.mavensample;

import org.apache.log4j.Logger;

public class CalcTest {
	final static Logger logger = Logger.getLogger(CalcTest.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		int num1 = 3;
		int num2 = 1;
		if(logger.isDebugEnabled()){
			logger.debug("Calling Add Method ");
			logger.debug("The sum of "+num1+"and"+num2+"is"+cal.add(num1, num2));
		}
		if(logger.isInfoEnabled()) {
			logger.info("Calling Subtract methood");
			logger.info("The difference of "+num1+"and"+num2+"is"+cal.subtract(num1, num2));			
		}
	}
}
