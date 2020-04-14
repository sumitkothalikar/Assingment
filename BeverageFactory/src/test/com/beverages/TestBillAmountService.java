package test.com.beverages;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.beverages.services.BillAmountService;

public class TestBillAmountService {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalTotalCostOfOrder() {
		
		BillAmountService billAm = new BillAmountService();
		String [] orders = {"Chai,-sugar"};
		double finalCost =billAm.calTotalCostOfOrder(orders);
		
		Assert.assertEquals("Test Passed", finalCost,3.5 );
		//fail("Not yet implemented");
	}

}
