import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exception.InsufficientFundsException;

public class Accounttest {
	account Test_account = new account(1122,20000,4.5);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Test_account.setBalance(20000);
		Test_account.setAnnualInterestRate(4.5);
		Test_account.setId(1122);
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testAccountFail() {
		try {
			Test_account.withdraw(30000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(expected = InsufficientFundsException.class)
	public void testAccount() throws InsufficientFundsException {
		Test_account.withdraw(30000);
	}
	@Test
	public void testAccount2() {
		Test_account.deposit(3000);
	}

}
