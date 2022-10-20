package testNG;

import org.testng.annotations.Test;

public class Exampleparam2 {
  @Test(priority = 1)
  public void login() {
	  System.out.println("hello,  lets  login");  
  }
  @Test(priority = 2)
  public void sendEmail() {
	  System.out.println("hello, lets send Email ");  
  }
  @Test(priority = 3)
  public void logout() {
	  System.out.println("hello, lets logout ");  
  }
  
}
//Default priority is zero
// if priority is same than than execute in alphabetical order
