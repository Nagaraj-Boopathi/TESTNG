package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testSuiteExam {
	
	WebDriver driver;
	long totalTime;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void startExecution() {
	
		System.out.println("Testcase execution started");
		
	}
	
	
  @Test
  public void openGoogle() { 
	  long startTime = System.currentTimeMillis();
	  System.out.println("start time" + startTime);
	  
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = (WebDriver) new ChromeDriver(co);
	  System.setProperty ("webdriver.chrome.driver","C:\\AUTO\\chromedriver\\chromedriver.exe");
	  driver.get("https://www.google.com/");
	  driver.quit();
	  
	  long endTime = System.currentTimeMillis();
	  System.out.println("end time"+ endTime);
  }
  
  
 @Test
  public void openBing() {
  
	  long startTime = System.currentTimeMillis();
	  System.out.println("start time" + startTime);
	  
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = (WebDriver) new ChromeDriver(co);
	  System.setProperty ("webdriver.chrome.driver","C:\\AUTO\\chromedriver\\chromedriver.exe");
	  driver.get("https://www.bing.com/");
	  driver.quit();
	  
	  long endTime = System.currentTimeMillis();
	  System.out.println("end time"+ endTime);
  }
  
  
  @Test
  public void openYahoo() {
  
	  long startTime = System.currentTimeMillis();
	  System.out.println("start time" + startTime);
	  
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = (WebDriver) new ChromeDriver(co);
	  System.setProperty ("webdriver.chrome.driver","C:\\AUTO\\chromedriver\\chromedriver.exe");
	  driver.get("https://www.yahoo.com/");
	  driver.quit();
	  
      long endTime = System.currentTimeMillis();
      System.out.println("end time"+ endTime);
      
  }
  
  
  @AfterSuite
  public void stopExecution() {
	  System.out.println("Test execution completed");
	  
	  totalTime = endTime-startTime;
	  System.out.println("total time"+ totalTime);
} 
  
}
