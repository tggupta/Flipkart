package Search;

import org.testng.IExecutionListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener, ISuiteListener,IInvokedMethodListener, IExecutionListener  {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test execution started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test execution finished");
	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Suite test execution started");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Suite test execution failed");
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("methods invoked");
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
	}
	long startTime;
	long endTime;
	
	@Override
	public void onExecutionStart() {
		startTime=System.currentTimeMillis();
		System.out.println("***** "+ startTime +" ******");
				
	}

	@Override
	public void onExecutionFinish() {
		endTime=System.currentTimeMillis();
		System.out.println("****** "+ endTime +" ******");
		System.out.println("Total Execution Time is "+ (endTime-startTime));
	}

}
