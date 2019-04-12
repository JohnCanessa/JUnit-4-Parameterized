package junit.parameterized.canessa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/*
 * Class used to experiment with objects.
 */
class Pair {
	
	// **** ****
	int		num;
	boolean isPrime;
	
	// **** constructor ****
	public Pair() {
	}
	
	// **** constructor ****
	public Pair(int num, boolean isPrime) {
		this.num 		= num;
		this.isPrime 	= isPrime;
	}
	
	// **** to string ****
	public String toString() {
		return "" + this.num + " " + this.isPrime;
	}
}


/*
 * Scaffolding for testing.
 */
public class Solution {

	public static void main(String[] args) {

		// **** ****
		final int ENTRIES	= 5;
		
		// **** declare array of objects ****
		Object[][] arr = new Object[ENTRIES][2];
		
		// **** populate the array of objects with a number and a boolean ****
		for (int i = 0; i < ENTRIES; i++) {
			arr[i][0] = i;
			arr[i][1] = ((i % 2) == 0) ? true : false;
		}
		
		// **** ****
		for (int i = 0; i < ENTRIES; i++)
			System.out.println("main <<< int: " + arr[i][0] + " boolean: " + arr[i][1]);
		System.out.println();
		
		// **** convert the array to a list ****
		List<Object[]> list = Arrays.asList(arr);

		// **** iterate though the list displaying and creating pairs  ****
		Iterator<Object[]> it = list.iterator();
		while (it.hasNext()) {
			
			// **** ****
			Object[] obj = it.next();
			System.out.println("main <<< " + obj[0] + " " + obj[1]);
			
			// **** ****
			Pair pair = new Pair(((Number)obj[0]).intValue(), ((Boolean)obj[1]));
			System.out.println("main <<< pair: " + pair.toString());
		}
		System.out.println();
		
		
		// **** declare an array of objects with numbers and flags 
		//		that indicate if the number is prime or not ****
		Object[][] oa = new Object[][] {
									     {  2, true },
									     {  4, false },
									     {  6, false },
									     { 17, true },
									     { 19, true },
									     { 22, false },
									     { 23, true }};
									     
		// **** instantiate an array list ****
		ArrayList<Object[]> al = new ArrayList<Object[]>();

		// **** populate the array list ****
		for (Object[] obj : oa) {
			al.add(obj);
		}
		System.out.println("main <<< al.size: " + al.size());

		// **** iterate though the array list displaying and creating pairs ****
		Iterator<Object[]> alit = al.iterator();
		while (alit.hasNext()) {
			
			// **** ****
			Object[] obj = alit.next();
			System.out.println("main <<< " + obj[0] + " " + obj[1]);
			
			// **** ****
			Pair pair = new Pair(((Number)obj[0]).intValue(), ((Boolean)obj[1]));
			System.out.println("main <<< pair: " + pair.toString());
		}
		System.out.println();

		
//		// **** open scanner ****
//		Scanner sc = new Scanner(System.in);
		
		// **** instantiate class ****
		PrimeNumberChecker pnc = new PrimeNumberChecker();
		
		// **** test value(s) ****
		for (int num = 0; num <= 23; num++) {
			System.out.println("main <<< num: " + num + " " + pnc.validate(num));
		}
		
//		// **** close scanner ****
//		sc.close();
	}

}
