package UtilityClass;

public class TestCase1 extends Base {
	public static void main(String[] args) throws InterruptedException {

		preCondition();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		logOut();
		Thread.sleep(2000);
		postCondition();
		Thread.sleep(2000);

	}

}
