package april15;

import org.testng.annotations.Test;

public class Testingprogramme {
	
	@Test ( priority = 1)
	public static void test01() {

		System.out.println("Log_In");
	}
       @Test ( priority = 3 , enabled = false)
	public static void test02() {

		System.out.println("Log_Out");
	}
        @Test ( priority = 4, invocationCount =2)
	public static void test03() {

		System.out.println("Send Mail");
	}
      @Test ( priority = 3)
	public static void test04() {

		System.out.println("Delete Email");
	}

}
