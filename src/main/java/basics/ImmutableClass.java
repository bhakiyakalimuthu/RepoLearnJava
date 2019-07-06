package basics;

public class ImmutableClass implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		ImmutableClass immutableClass = new ImmutableClass();
		System.out.println(immutableClass.getClass());
		System.out.println(immutableClass.hashCode());
		System.out.println(immutableClass.clone());
	}
}
