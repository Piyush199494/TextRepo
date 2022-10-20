package testNG;

import org.testng.annotations.Test;

public class Example2 {
  
	  
	  @Test(dependsOnMethods = "checknotification",enabled = true)
	  public void login() {
		  System.out.println("login to facebook");
		  
	  }@Test(dependsOnMethods = "signout",enabled = true)
	  public void checknotification() {
		  System.out.println("login to check notification");
	  }@Test(enabled = true,expectedExceptions = ArithmeticException.class)
	  public void signout() {
		  System.out.println("signout after checking notification");
		  int i = 10/0;
  }
}
/*we can handle exception but we have to know which exception is coming
 * 
 * */
