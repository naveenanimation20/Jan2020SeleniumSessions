package TestNGSessions;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestOrderPriorityBased.class)
public class RandomOrderTest {
	@Test(priority=1)
	public void Test1() {
		System.out.println("Here in test 1.");
	}

	@Test
	public void Test2() {
		System.out.println("Here in test 2.");
	}

	@Test()
	public void Test3() {
		System.out.println("Here in test 3.");
	}

	@Test(priority=1)
	public void Test4() {
		System.out.println("Here in test 4.");
	}

	@Test()
	public void Test5() {
		System.out.println("Here in test 5.");
	}

}
