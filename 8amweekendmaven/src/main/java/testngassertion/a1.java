package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testnglistener.c1.class)
public class a1 {
	/*assertion : technique where we will be comparing actual result with obtained result
	 * 
	 * hard 
	 *     provided by Assert builtin class
	 *     stati in nature
	 *     assertion fails, it wont proceed further
	 *     
	 * soft 
	 *     provided by softassert builtin class
	 *     nonstatic in nature
	 *     even if assertion fails=> it will proceed further
	 *     invoke assert All()
	 * 
	 * assertEquals(actual, expected)
	 * assertNotEquals(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 ** 
	 * */
	
	@Test
	public void bt()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "skdfkndknf");
		Assert.assertNotEquals(ob.getTitle(), "skdfkndknf");
		WebElement ele = ob.findElementByLinkText("Gmail");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}

}
