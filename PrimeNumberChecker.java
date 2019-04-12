package junit.parameterized.canessa;


/*
 * Class that verifies if a number is prime or not.
 */
public class PrimeNumberChecker {
	
	// **** validate prime number ****
	public Boolean validate(final Integer primeNumber) {

		// **** ****
		if (primeNumber < 2)
			return false;
		
		// **** ****
		for (int i = 2; i <= (primeNumber / 2); i++) {
         if (primeNumber % i == 0) {
            return false;
         	}
		}
      
		// **** ****
		return true;
	}

}
