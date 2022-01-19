package Practise1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("I am successful");
	}

}
