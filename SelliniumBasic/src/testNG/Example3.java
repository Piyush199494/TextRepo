package testNG;

import org.testng.annotations.Test;

public class Example3 {
	
	 @Test(dependsOnMethods = "checknotification",enabled = true)
	  public void login() {
		  System.out.println("login to facebook");
		  
	  }@Test(dependsOnMethods = "signout",enabled = true,timeOut=6000)
	  public void checknotification() {
		  
		  System.out.println("login to check notification");
		  
		  try {
			  Thread.sleep(5000);
		  }catch(InterruptedException e) {
			  e.printStackTrace();
		  }
	  }@Test(enabled = true,expectedExceptions = ArithmeticException.class)
	  public void signout() {
		  System.out.println("signout after checking notification");
		  int i = 10/0;
}
	  }
