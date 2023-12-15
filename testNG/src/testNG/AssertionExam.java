package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExam {
	String name = "Agni";
	String vehicle = "Van";
	boolean value = false;
	
  @Test
  public void assertion() {
	  
	  Assert.assertEquals(name, "Agni");
	  
	  Assert.assertNotEquals(vehicle, "kan");
	  
	  Assert.assertTrue(value, "This should not be true");
  }
}
