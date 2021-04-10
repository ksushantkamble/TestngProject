package NewTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsDemo 
{
	int a=10,b=20,c;
	@Test(groups= {"Addition1"})
	public void add()
	{
		c=a+b;
		System.out.println("Addition= "+c);
		Assert.assertEquals(c, 30);
	}
	@Test(groups= {"Addition2"})
	public void sub()
	{
		c=a-b;
		System.out.println("Subtraction= "+c);
		Assert.assertEquals(c,-10);
	}
}
