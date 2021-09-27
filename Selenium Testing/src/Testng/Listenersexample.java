package Testng;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class Listenersexample implements ITestListener{            // ITestListener = interface
	
	@Override
	public void onTestStart(ITestResult results) {
		System.out.println("Test case is going to execute");
	}
	
	@Override
	public void onTestSuccess(ITestResult results) {
		System.out.println("Test case is executeted");
	}
	
	@Override
	public void onTestSkipped(ITestResult results) {
		System.out.println("Test case is Skipped");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult results) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Before Everything");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("After Everything");
		
	}

}
