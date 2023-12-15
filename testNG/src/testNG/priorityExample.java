package testNG;

import org.testng.annotations.Test;

public class priorityExample {
	
		  @Test(priority=0)
		  public void startTheCar() {
		  System.out.println("Start the car");
		  }
	
		  @Test(priority=1)
		  public void firstgear() {
			  System.out.println("first");
		  }
		  
		  @Test(priority=2)
		  public void secondgear() {
			  System.out.println("second");
		  }
		  
		  @Test(priority=3)
		  public void thirdgear() {
			  System.out.println("third");
		  }
		  
		  @Test(priority=4)
		  public void fourthgear() {
			  System.out.println("fourth");
		  }
		  
		  
}
