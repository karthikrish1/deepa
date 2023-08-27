package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener :   builtin interface
	// onstart, onfinish, onsucess,onfailure, on skipping
	//class<=> interface=>   implements Interfacename 
	//right click=> source=> override/implement methods

public class c1 implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("SUCESSSS");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED");
	}

	public void onStart(ITestContext context) {
		System.out.println("STARTED");
	}

	public void onFinish(ITestContext context) {
		System.out.println("FINISHED");
	}
	
	 

}
