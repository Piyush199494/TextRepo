package testNG;

import org.testng.annotations.Test;

public class Example_param3 {
  @Test(enabled = false)
  public void parameter1() {
	  System.out.println("hello i am parameter 1 ");
  }
  @Test(enabled = false)
  public void parameter2() {
	  System.out.println("hello i am parameter 2 ");
  }
  @Test(enabled = true)
  public void parameter3() {
	  System.out.println("hello i am parameter 3 ");
  }
}
