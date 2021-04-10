package NewTestNG;

import org.testng.annotations.Test;

public class FirstTestNgScript 
{
	@Test(priority=1)
	public void loginApllication()
	{
		System.out.println("Hello TestNG");
	}
	@Test(priority=2)
	public void selectItem()
	{
		System.out.println("Select Item");
	}
	@Test(priority=3)
	public void checkOUT()
	{
		System.out.println("Check out");
	}
}
