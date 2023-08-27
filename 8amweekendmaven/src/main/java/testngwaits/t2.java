package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class t2 {

	@Test
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(ob,5);
		
		//title
		
		//w.until(ExpectedConditions.titleIs("yahoo")); //5
		//w.until(ExpectedConditions.titleContains("oo")); //5
		
		//alert is present or not
		//w.until(ExpectedConditions.alertIsPresent());
		
		//visibility of an element
		//finding the element and checking its visibility 
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail"))); //5
		
		//visibility of more elements
		// images=> collect=> visible
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img"))); //5
		
		//element is clickable or not
	    // finding the element and checking whether it is clickable or not
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images"))); //5
		
		ob.quit();
		
	}

}




/*explicit wait
 * 
 * create an object for webdriver wait 
 * pass driver instance and time limit as input
 * call untill method
 * call conditions 
 * 
 * 
 * code is correct: if it executes within time limit, it will proceed further, will not wait for completion of time limit
 * code is wrong: it will wait for completion of time limit, then it will throw up error 
* 
 * */