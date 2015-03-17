import static org.junit.Assert.*;
import java.lang.IllegalArgumentException;

import org.junit.Test;


public class AmountTest {

	@Test
	public void test_amount() {
		Amount mnt = new Amount(11.56);
				
		int calDollars = mnt.dollars();
		int calQuarters = mnt.quarters();
		int calDime = mnt.dime();
		int calNickels = mnt.nickels();
		int calPennies = mnt.pennies();
		
		
		int expectedDollars = 11;
		int expectedQuarters = 2;
		int expectedDime = 0;
		int expectedNickels = 1;
		int expectedPennies = 1;
		
		assertEquals("dollars should be equals 11", expectedDollars, calDollars);
		assertEquals("quarters should be equals 2", expectedQuarters, calQuarters);
		assertEquals("dimes should be equals 0", expectedDime, calDime);
		assertEquals("nickels should be equals 1", expectedNickels, calNickels);
		assertEquals("pennies should be equals 1", expectedPennies, calPennies);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_amount_IllegalArgumentException()
	{
		Amount mnt = new Amount(-11.56);
	}
	
	@Test
	public void test_amount_zero()
	{
		Amount mnt = new Amount(0);
		
		int calDollars = mnt.dollars();
		int calQuarters = mnt.quarters();
		int calDime = mnt.dime();
		int calNickels = mnt.nickels();
		int calPennies = mnt.pennies();
		
		int expectedDollars = 0;
		int expectedQuarters = 0;
		int expectedDime = 0;
		int expectedNickels = 0;
		int expectedPennies = 0;
		
		assertEquals("dollars should be equals 0", expectedDollars, calDollars);
		assertEquals("quarters should be equals 0", expectedQuarters, calQuarters);
		assertEquals("dimes should be equals 0", expectedDime, calDime);
		assertEquals("nickels should be equals 0", expectedNickels, calNickels);
		assertEquals("pennies should be equals 0", expectedPennies, calPennies);
	}
	
	

}
