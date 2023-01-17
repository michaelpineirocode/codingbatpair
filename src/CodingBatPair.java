// Authors: Linzhi Leiker and Michael Pineiro

public class CodingBatPair {

	// Evenly Spaced Exercise
	public static boolean evenlySpaced(int a, int b, int c) {
		int[] numbers = {a, b, c};
		int min = numbers[0];
		int max = numbers[0];
		int middle = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < max && numbers[i] > min) {
				middle = numbers[i];
			}
		}
		
		if (max-middle == middle-min) {
			return true;
		}
		else {
			return false;
		}
		
	}

	/*
	 * Expected this run
	 * evenlySpaced(2, 4, 6) → true	true	OK	
		evenlySpaced(4, 6, 2) → true	true	OK	
		evenlySpaced(4, 6, 3) → false	false	OK	
		evenlySpaced(6, 2, 4) → true	true	OK	
		evenlySpaced(6, 2, 8) → false	false	OK	
		evenlySpaced(2, 2, 2) → true	true	OK	
		evenlySpaced(2, 2, 3) → false	false	OK	
		evenlySpaced(9, 10, 11) → true	true	OK	
		evenlySpaced(10, 9, 11) → true	true	OK	
		evenlySpaced(10, 9, 9) → false	false	OK	
		evenlySpaced(2, 4, 4) → false	false	OK	
		evenlySpaced(2, 2, 4) → false	false	OK	
		evenlySpaced(3, 6, 12) → false	false	OK	
		evenlySpaced(12, 3, 6) → false	false	OK	
		other tests OK
	 */
	
	// Plus Out Exercise
	
	/*
	 * Expected this run
	 */
	
	// Count Clumps Exercise
	
	/*
	 * Expected this run
	 */
	
	// Fix 34 Exercise
	
	/*
	 * Expected this run
	 */
	
	public static void main(String[] args) {
		
	}
}
