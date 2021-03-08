package com.axisBank;

import org.testng.annotations.Test;

import com.GenericMethods.CommonMethods;
import com.paypalProject.phonePayFundTransfer;

public class testngaxisBankFundTransfer {
	@Test
	public static void axisBankTransferAmt(){
		//Calling phonePayProject common method
		CommonMethods cm = new CommonMethods();
		cm.transferAmt("Naveen", "Kumar", "500");
		
		//Calling phonePayProject @Test method
		phonePayFundTransfer ft = new phonePayFundTransfer();
		ft.phonePayTransferAmt();
	}
}
