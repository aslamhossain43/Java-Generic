package generic;

/**
 *
 * @author Md. Aslam Hossain
 * @Date May 14, 2022
 *
 */
public class GenericMethod {
	public static <T> void printArray(T[] array) {
		for (T t : array) {
			System.out.printf(t + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 3, 5, 6 };
		Double[] doubleArray = { 1.2, 3.4, 6.7, 8.9 };
		String[] stringArray = { "aslam", "asha", "zoti", "shobuj" };
//		intArray call
		printArray(intArray);
//		doubleArray call
		printArray(doubleArray);
//		stringArray call
		printArray(stringArray);
	}

}
