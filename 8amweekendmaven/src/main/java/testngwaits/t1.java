package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t1 {
	
@Test
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//6
		System.out.println(ob.getCurrentUrl());//6
		ob.navigate().refresh();//6
		ob.findElementByLinkText("dhivya"); //6
		ob.quit();//6
	}
}

/*
 * testngwait/webdriver synchronisation 
 * 
 * conditional            : explicit wait 
 * unconditional          : implicit wait, thread.sleep()
 * 
 * implicit wait  :   once it is declared all the code which is present after it will take the timelimit
 * 
 * code is correct: if it executes within time limit, it will proceed further, will not wait for completion of time limit
 * code is wrong: it will wait for completion of time limit, then it will throw up error 
* 
 * */