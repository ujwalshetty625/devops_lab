package pgrm1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultTest {
	
	@Test
	public void TestPass() {
	Assert.assertEquals(Result.display(60),"pass");
	}
	
	@Test
	public void TestFail() {
	Assert.assertEquals(Result.display(6),"fail");
	}
	
	@Test
	public void TestInvalid() {
	Assert.assertEquals(Result.display(-60),"invalid");
	}
	
	public static void main(String[] args) {
		

	}

}
