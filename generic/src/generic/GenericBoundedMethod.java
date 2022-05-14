package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Md. Aslam Hossain
 * @Date May 14, 2022
 *
 */
public class GenericBoundedMethod {
	public static <T extends Number> List<T> convertArrayToList(T[] array) {
		return new ArrayList<T>(Arrays.asList(array));

	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4 };
//		if intArray use String then compile error
//		String[]stringArray = {"Aslam","Zoti"};
		System.out.println("List is: " + convertArrayToList(intArray));
	}

}
