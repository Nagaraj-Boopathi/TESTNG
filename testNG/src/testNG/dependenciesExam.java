package testNG;

import org.testng.annotations.Test;

public class dependenciesExam {
	
  @Test(enabled=false)
  public void highSchool() {
	  System.out.println("High school");
  }
  
  @Test(dependsOnMethods = "highSchool")
  public void higherSecondary() {
	  System.out.println("Higher secondary school");
  }
  
  @Test(dependsOnMethods = "higherSecondary")
  public void engineering() {
	  System.out.println("college");
  }
  
}
