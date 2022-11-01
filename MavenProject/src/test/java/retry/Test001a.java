package retry;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class Test001a extends TestListenerAdapter {



	// packagename.classname.class
	@Test
	public void Test1() {
          
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test02() {
	
		Assert.assertEquals(true, false);
	}

	

}
