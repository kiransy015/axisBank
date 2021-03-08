package com.axisBank;

import com.GenericMethods.CommonMethods;
import com.paypalProject.phonePayFundTransfer;

public class axisBankFundTransfer {

	public static void main(String[] args) {
		
		//Calling phonePayProject common method
		CommonMethods cm = new CommonMethods();
		cm.transferAmt("Naveen", "Kumar", "500");
				
		//Calling phonePayProject @Test method
		phonePayFundTransfer ft = new phonePayFundTransfer();
		ft.phonePayTransferAmt();

	}

}
