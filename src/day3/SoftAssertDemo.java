package day3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void hardassertSoft() {
		System.out.println("assertion started");
		Assert.assertEquals(29, 44);
		System.out.println("ended  ");

	}

	@Test(priority = 0)
	public void testSoft() {
		SoftAssert sa = new SoftAssert();
		System.out.println(" started successs");
		sa.assertEquals(22, 44);
		System.out.println("ended  ghgjgjgkglgl");
		sa.assertAll();
	}

}
