package generic;

/**
 *
 * @author Md. Aslam Hossain
 * @Date May 14, 2022
 *
 */
public class GenericClass<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		GenericClass<Integer> intGenericClass = new GenericClass<Integer>();
		intGenericClass.add(new Integer(10));
		GenericClass<String> strinGenericClass = new GenericClass<String>();
		strinGenericClass.add("Aslam");

		System.out.println("Int: " + intGenericClass.get());
		System.out.println("String: " + strinGenericClass.get());

	}

}
