package retry;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.css.Counter;

public class Test002 {
	static int num =7;
	
	// packagename.classname.class
  @Test
  public void Test1() {
	  
	  Assert.assertEquals(false, true);
  }
  @Test
  public void Test02() {
	  Assert .assertEquals(true, false);
  }
  @Test
  public void Test03() {
	  
	  num--;
	  Assert.assertTrue(num<4);
  }
}
