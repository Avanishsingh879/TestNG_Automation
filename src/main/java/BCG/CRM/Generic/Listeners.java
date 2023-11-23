package BCG.CRM.Generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("test case TestStart and deatils  " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test case TestSuccess and deatils  " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("test case Failed and deatils  " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("test case TestSkip and deatils  " +result.getName());
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext result) {
		
	}

	@Override
	public void onFinish(ITestContext result) {
		
		
	}

}
