package testNG;

import org.testng.annotations.Test;

public class Example4 {
	public class Example3 {

		@Test
		public void login() {
			System.out.println("login to facebook");

		}

		@Test
		public void checknotification() {

			System.out.println("login to check notification");

		}

		@Test(description = "checking singout functionality ")
		public void signout() {
			System.out.println("signout after checking notification");

		}
	}

}
