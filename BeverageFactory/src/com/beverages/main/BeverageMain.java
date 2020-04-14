package com.beverages.main;

import com.beverages.services.BillAmountService;

public class BeverageMain {

	public static void main(String[] args) {

		
		
		BillAmountService billAm = new BillAmountService();
       	String [] orders = {"Chai,-sugaR,-milk","STRAWBERRIES"};
		billAm.calTotalCostOfOrder(orders);
	}

}
