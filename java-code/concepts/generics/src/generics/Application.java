package generics;

public class Application {

	public static void main(String[] args) {
		Integer[] intArray = {3,4,5,6};
		Double[] doubleArray = {2.3,5.7,1.2};
		Character[] charDouble = {'H','e'};
		String[] stringArray = {"Boston","New York", "Bolivia"};
		
        //displayArray(intArray);
        //displayArray(stringArray);
        System.out.println(getFirst(stringArray));
	}

	// Generic Function
	public static <T> void displayArray(T[] array) {
		for(T x : array) {
			System.out.print(x+" ");
		}
		System.out.println("");
	}
	
	public static <T> T getFirst(T[] array) {
		return array[0];
	}
	
}
