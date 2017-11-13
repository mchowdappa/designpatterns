package com.mcp.designpatterns.behavioral.chainofresponsibility;

import org.apache.log4j.Logger;

import com.mcp.designpatterns.behavioral.chainofresponsibility.ATM;

import junit.framework.TestCase;

public class ATMWidthdrawTest extends TestCase {

	Logger logger = Logger.getLogger(ATMWidthdrawTest.class);
	private ATM atm;

	@Override
	public void setUp() {
		atm = ATM.getATM(5, 5, 10, 20); 
		//         5*2000 = 10000
		//         5*1000 =  5000
		//        10* 500 =  5000
		//        20* 100 =  2000
     	//	----------------------------
		//Total ..........  22000
		
	}
	
	public void testWidthdraw500000(){
		logger.info("Widthdrawing for 500000");
		atm.widthdraw(500000);
		logger.info("END");
	}
	
	public void testWidthdraw5600(){
		logger.info("Widthdrawing for 5600");
		atm.widthdraw(5600);
		logger.info("END");
	}
	
	public void testWidthdraw7300(){
		logger.info("Widthdrawing for 7300");
		atm.widthdraw(7300);
		logger.info("END");
	}
}
