package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case execution started"+result.getStatus());
		System.out.println("********************");
		System.out.println(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case execution successful"+result.getStatus());
		System.out.println("********************");
		System.out.println(result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case execution failed"+result.getStatus());
		System.out.println("********************");
		System.out.println(result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("********************");
		System.out.println(context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("********************");
		System.out.println(context.getName());
		
	}

	
}
