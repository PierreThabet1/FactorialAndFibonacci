
public class Journal2 {

	public static void main(String[] args) {


		System.out.println(factorial(5));

		System.out.println(fibonacci(6));



	} // End of main.

	/**
	 * This method calculates the factorial of numbers, except for numbers
	 * below zero.
	 * @param N.
	 * @return int.
	 * @throws IllegalArgumentException
	 */
	static int factorial(int N) throws IllegalArgumentException {

		if (N < 0) {
			throw new IllegalArgumentException("Number should be bigger"
					+ " than 0");
		}

		else if (N == 0) {
			return 1;
		}

		else {
			return N * factorial(N-1);
		}

	} // End of factorial.


	/**
	 * This method calculates fibonacci of numbers, except for numbers
	 * below zero.
	 * @param N
	 * @return int.
	 * @throws IllegalArgumentException
	 */
	static int fibonacci(int N) throws IllegalArgumentException {

		if (N < 0) {
			throw new IllegalArgumentException("Number should be bigger"
					+ " than 0");
		}
		else if (N == 0) {
			return 1;
		}

		else if (N == 1) {
			return 1;
		}

		else {

			return fibonacci(N - 2) + fibonacci(N - 1);
		}

	} // End of fibonacci.


} // End of class.
