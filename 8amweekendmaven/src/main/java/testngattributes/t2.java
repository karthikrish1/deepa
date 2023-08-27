package testngattributes;

import org.testng.annotations.Test;

public class t2 {
	
	@Test(timeOut=1000)
	public void t1() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("hi");
	}

}
