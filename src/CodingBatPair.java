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
	public static String plusOut(String str, String word) {
		String newStr = "";
		if (str.contains(word) != false) {
			  int wordIndex = str.indexOf(word);
			  for (int i = 0; i < wordIndex; i++) {
				  newStr = newStr.concat("+");
			  }
			  newStr = newStr.concat(word);
			  String restOfStr = str.substring(wordIndex + word.length());
			  String nextPart = plusOut(restOfStr, word);
			  str = newStr.concat(nextPart);
		  } else {
			  for (int i = 0; i < str.length(); i++) {
				 newStr = newStr.concat("+");
			  }
			  str = newStr;
		  }
		return str;
	}
	/*
	 * Expected this run
	 *  plusOut("12xy34", "xy") → "++xy++"	"++xy++"	OK	
		plusOut("12xy34", "1") → "1+++++"	"1+++++"	OK	
		plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"	"++xy++xy+++xy"	OK	
		plusOut("abXYabcXYZ", "ab") → "ab++ab++++"	"ab++ab++++"	OK	
		plusOut("abXYabcXYZ", "abc") → "++++abc+++"	"++++abc+++"	OK	
		plusOut("abXYabcXYZ", "XY") → "++XY+++XY+"	"++XY+++XY+"	OK	
		plusOut("abXYxyzXYZ", "XYZ") → "+++++++XYZ"	"+++++++XYZ"	OK	
		plusOut("--++ab", "++") → "++++++"	"++++++"	OK	
		plusOut("aaxxxxbb", "xx") → "++xxxx++"	"++xxxx++"	OK	
		plusOut("123123", "3") → "++3++3"	"++3++3"	OK	
		other tests OK
	 */
	
	// Count Clumps Exercise
	
	/*
	 * Expected this run
	 */
	
	// Fix 34 Exercise
	public int[] fix34(int[] nums) {
		int minimumStart = 0;
		for (int i = 0; i < nums.length; i++) {
			  if (nums[i] == 3) {
				  int firstNumberIndex = i + 1;
				  int secondNumber = 4;
				  for (int j = minimumStart; j < nums.length; j++) {
					  if (nums[j] == 4) {
						  secondNumber = nums[j];
						  nums[j] = nums[firstNumberIndex];
						  minimumStart = j;
						  break;
					  }
				  }
				  nums[firstNumberIndex] = secondNumber;
			  }
		  }
		  return nums;
	}
	/*
	 * Expected this run
	 */
	
	public static void main(String[] args) {
		System.out.println(plusOut("12xy34", "xy"));
	}
}
