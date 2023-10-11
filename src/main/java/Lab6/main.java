package Lab6;

/*
 * note the bad coding style (deliberately written for debugging exercise) 
 */
public class main {
	public static void main(String[] args) {
		Animal animals[] = new Animal[10];
		/*
			The bug is on line 9 (of the original unedited) of the program

			The enhanced for loop for (type var: array) uses var to reference to the
			current element in the array, reassigning a newly created object does not
			assign it into the array as the reference is no longer pointing to the element
			in the array.

			I have changed into a regular for loop with an explicit assignment
		 */
//		for (Animal a : animals)
//			a = new Animal();
		for (int j = 0; j < 10; j++) animals[j] = new Animal();

		for (int iii = 0; iii < 10; iii++) {
			int ii = 0;
			for (; ii < 100 && animals[iii].isAlive() ; ii++) {
				System.out.print(animals[iii].getWeight() + " ");
				animals[iii].eat();
				if (ii % 3 == 0)
				animals[iii].poo();
			}
		}	
	}
}
