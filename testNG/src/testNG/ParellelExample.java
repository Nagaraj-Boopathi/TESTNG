package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelExample {
	
  @Test
  public void openGoogle() {
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = (WebDriver) new ChromeDriver(co);
	  driver.get("https://www.google.com/");
	  
  }
  
  @Test
  public void openBing() {
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = (WebDriver) new ChromeDriver(co);
	  driver.get("https://www.bing.com/");
  }
}
