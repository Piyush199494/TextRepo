package retry;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.css.Counter;

public class Test01 {
	static int num =7;
	
	// packagename.classname.class
  @Test(retryAnalyzer = retry.RetryAnalyzer1 .class)
  public void Test1() {
	  
	  Assert.assertEquals(false, true);
  }
  @Test (retryAnalyzer = retry.RetryAnalyzer1 .class)
  public void Test02() {
	  Assert .assertEquals(true, false);
  }
  @Test( invocationCount = 3,retryAnalyzer = retry.RetryAnalyzer1 .class)
  public void Test03() {
	  
	  num--;
	  Assert.assertTrue(num<4);
  }
}
