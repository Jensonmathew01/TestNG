package ustbatchno3.TestNG;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testcustomer {
	
	@Test
	public void customertest1()
	{
		
		List<Integer> expected1=Arrays.asList(4800, 3600, 8000, 12500, 10800);
		List<Integer> actual1=company.total1();
		Assert.assertEquals(expected1, actual1);
				
	}
	@Test
	public void customertest2()
	{
		List<Integer> expected2=Arrays.asList(2400, 2000, 3600, 6000, 7200);
		List<Integer> actual2=company.total2();
		Assert.assertEquals(expected2, actual2);
	}
	

}
