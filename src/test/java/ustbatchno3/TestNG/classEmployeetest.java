Test the program with employee details.
**************************************	
package ustbatchno3.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class classEmployeetest
{
	@Test
	public void testemployee()
	{
		Employee e=new Employee("Jenson",22,"Developer");
		Assert.assertEquals(e.getName(), "Jenson");
	}
}
