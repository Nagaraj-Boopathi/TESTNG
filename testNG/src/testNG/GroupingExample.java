package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	/* scenario : a basket having different kinds of mobiles.
	 * let us say there are apple, moto, vivo, lenevo phones.
	 * i want to run tests only for vivo and lenovo phones
	 */
	
  @Test(groups={"apple"})
  public void apple1() {
	  System.out.println("Apple testing");
  }
  
  @Test(groups={"apple"})
  public void apple2() {
	  System.out.println("Apple testing");
  }
  
  @Test(groups={"moto"})
  public void moto1() {
	  System.out.println("moto testing");
  }
  
  @Test(groups={"moto"})
  public void moto2() {
	  System.out.println("moto testing");
  }
  
  @Test(groups={"vivo"})
  public void vivo1() {
	  System.out.println("vivo testing");
  }
  
  @Test(groups={"vivo"})
  public void vivo2() {
	  System.out.println("vivo testing");
  }
  
  @Test(groups={"lenovo"})
  public void lenovo1() {
	  System.out.println("lenovo testing");
  }
  
  @Test(groups={"lenovo"})
  public void lenovo2() {
	  System.out.println("lenovo testing");
  }
  
}
