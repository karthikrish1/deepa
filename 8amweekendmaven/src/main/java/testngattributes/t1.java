package testngattributes;

import org.testng.annotations.Test;

public class t1 {
	//priority: arrange the test case in a particular order
	// description: notes
	//groupa
	//invocationcount
	//enabled=false 
	//timeout
@Test(priority=0,description="ONE",groups="L",invocationCount=5,enabled=false )
public void m1()
{
	System.out.println("TEst case 1");
	}

@Test(priority=1,description="Two",groups="L")
public void m2()
{
	System.out.println("TEst case 2");
	}

@Test(priority=2,description="Tjree",groups="K")
public void ab()
{
	System.out.println("Test case 3");
	}

}
