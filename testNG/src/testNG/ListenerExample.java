package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener{  
	
@Override  
public void onTestStart(ITestResult result) {  
System.out.println("Testcase is going to execute"); 
}  
  
@Override  
public void onTestSuccess(ITestResult result) {  
	System.out.println("Testcase is passed");   
}  
  
@Override  
public void onTestFailure(ITestResult result) {  
// TODO Auto-generated method stub  
	System.out.println("Testcase is failed");
}  
  
@Override  
public void onTestSkipped(ITestResult result) {  
// TODO Auto-generated method stub  
System.out.println("Testcase is skipped");  
}  
  
@Override  
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
// TODO Auto-generated method stub  
  
}  
  
@Override  
public void onStart(ITestContext context) {  
// TODO Auto-generated method stub  
	System.out.println("before everything");
}  
  
@Override  
public void onFinish(ITestContext context) {  
// TODO Auto-generated method stub 
	System.out.println("after everything");
}  

}  
