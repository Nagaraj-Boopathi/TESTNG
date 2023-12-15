package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTestng {
	
  /*
	@Test
  public void firstTestCase() {
	  System.out.println("This is the first testcase");
  }
  @Test
  public void secondTestCase() {
	  System.out.println("This is the second testcase");
  }
  @Test
  public void thirdTestCase() {
	  System.out.println("This is the third testcase");
  }
  @Test
  public void fourthTestCase() {
	  System.out.println("This is the fourth testcase");
  }
  @Test
  public void fifthTestCase() {
	  System.out.println("This is the fifth testcase");
  }
  @Test
  public void sixthTestCase() {
	  System.out.println("This is the sixth testcase");
  }   */
	
	
	
	
	
/*	@Test (priority=0)
	public void DriveACar() {
		System.out.println("start the car");
	}
	@Test(priority=5, enabled = false)
	public void turnOnMusic() {
		System.out.println("turn on music");
	}
	
	@Test (priority=1)
	public void putFirstGear() {
		System.out.println("put first gear");
	}
	
	@Test (priority=2)
	public void putSecondGear() {
		System.out.println("put second gear");
	}
	
	@Test (priority=3)
	public void putThirdGear() {
		System.out.println("Put third gear");
	}
	
	@Test (priority=4)
	public void putFourthGear() {
		System.out.println("put Fourth gear");
	}   */
	
  
	
/*	@Test(priority=0, enabled=false)
	public void highSchool() {
		System.out.println("high school");
	}
	
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("higher secondary");
	}
	
	@Test(dependsOnMethods="higherSecondary")
	public void collge() {
		System.out.println("college");
	}    */
	
	@BeforeSuite
    public void openBrowser() {
		System.out.println("open browser");
	}
	
	@Test
	public void openGoogle() {
		  long startTime = System.currentTimeMillis();
		  System.out.println(startTime);
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = (WebDriver) new ChromeDriver(co);
		  System.setProperty ("webdriver.chrome.driver","C:\\AUTO\\chromedriver\\chromedriver.exe");
		  driver.get("https://www.google.com/");
		  driver.quit();
		  long endTime = System.currentTimeMillis();
		  System.out.println(endTime);
		  long totalTime = endTime - startTime;
		  System.out.println("total time taken"+ totalTime);
	}
	
	@Test
	public void openBing() {
		  long startTime = System.currentTimeMillis();
		  System.out.println(startTime);
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = (WebDriver) new ChromeDriver(co);
		  System.setProperty ("webdriver.chrome.driver","C:\\AUTO\\chromedriver\\chromedriver.exe");
		  driver.get("https://www.bing.com");
		  driver.quit();
		  long endTime = System.currentTimeMillis();
		  System.out.println(endTime);
		  long totalTime = endTime - startTime;
		  System.out.println("total time taken"+ totalTime);
	}
	
	@Test
	public void openYahoo() {
		  long startTime = System.currentTimeMillis();
		  System.out.println(startTime);
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = (WebDriver) new ChromeDriver(co);
		  System.setProperty ("webdriver.chrome.driver","C:\\AUTO\\chromedriver\\chromedriver.exe");
		  driver.get("https://yahoo.com");
		  driver.quit();
		  long endTime = System.currentTimeMillis();
		  System.out.println(endTime);
		  long totalTime = endTime - startTime;
		  System.out.println("total time taken"+ totalTime);
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	
	
}
