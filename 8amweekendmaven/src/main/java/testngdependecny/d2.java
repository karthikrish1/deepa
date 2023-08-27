package testngdependecny;

import org.testng.annotations.Test;

public class d2 {

	
	//dependsOnGroups: 
	
	@Test(priority=0,groups="L1")
	public void a()
	{
		System.out.println("case1");
	}
	
	
	@Test(priority=1,groups="L1")
	public void b()
	{
		System.out.println("case 2");
	}
	
	@Test(priority=2,dependsOnGroups="L1")
	public void c()
	{
		System.out.println("case3");
	}
	
}
