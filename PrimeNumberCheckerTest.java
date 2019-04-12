package junit.parameterized.canessa;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;


/*
 * Class tester with annotation [step 1]
 */
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	
	// **** instance variables used for single test [step 4] ****
	private Integer 				inputNumber;
	private Boolean 				expectedResult;
	   
	private PrimeNumberChecker 		primeNumberChecker;

	// **** instantiate the class to be checked ****
	@Before
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}

	// **** constructor [step 3] ****
	// Every time runner triggers, it will pass the arguments
	// from parameters we defined in primeNumbers() method
	public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
  
	// **** returns collection to test [step 2] ****
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() throws FileNotFoundException {
		
		// **** instantiate an array list ****
		ArrayList<Object[]> al = new ArrayList<Object[]>();
		
		// **** open a scanner with the specified file name ****
		String fileName = "c:\\temp\\prime_list.txt";
		
		// ???? ????
		System.out.println("primeNumbers <<< fileName ==>" + fileName + "<==");
		
		Scanner sc = new Scanner(new File(fileName));
		
		// **** read the lines from the scanner and populate the array list ****
		while (sc.hasNextLine()) {
			
			// **** ****
			String[] sa = sc.nextLine().split(" ");
			
			// ???? ????
			System.out.println("primeNumbers <<< sa[0]: " + sa[0] + " sa[1]: " + sa[1]);
			
			// **** declare array of objects ****
			Object[][] arr = new Object[1][2];
			
			// **** populate the array ****
			arr[0][0] = Integer.parseInt(sa[0]);
			arr[0][1] = Boolean.parseBoolean(sa[1]);

			// **** add the object to the list ****
			al.add(arr[0]);
		}
		
		// ???? ????
		System.out.println();

		// **** close the scanner ****
		sc.close();
		
		// ???? iterate through the array list ????
		Iterator<Object[]> alit = al.iterator();
		while (alit.hasNext()) {
			Object[] obj = alit.next();
			System.out.println("primeNumbers <<< " + obj[0] + " " + obj[1]);
		}
		System.out.println();

		// **** return the list of objects ****
		return al;
	}
	   
	// **** test case used to test with the instance variables [step 5] ****
	@Test
	public void testPrimeNumberChecker() {
		   
		// ???? ????
		System.out.println("testPrimeNumberChecker <<<    inputNumber: " + inputNumber);
		System.out.println("testPrimeNumberChecker <<< expectedResult: " + expectedResult);
	   
		// **** ****
		assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
	}

}
