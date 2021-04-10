package main;

public class Loops {

	public static void main(String[] args) {
		//This first loop prints even numbers 0-100
		int i = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		//This second loop prints every 3rd number going backwards from 100 
		int y = 100;
		while (y >=0) {
			System.out.println(y);
			y -= 3;
			}
		// This Third loop prints every other number from 1-100
		for (int z = 1; z<= 100; z+= 2) {
			System.out.println(z);
		}
		// This fourth loop prints every number 0 - 100, but if its divisible by 15( 3 and 5), 5, and 3 it prints helloworld, hello, and world respectively 
		for (int x = 0; x<=100; x++) {
			if (x % 15 == 0) {
				System.out.println("HelloWorld");
			} else if (x % 5 == 0) {
				System.out.println("World");
				
			} else if (x % 3 == 0) {
				System.out.println("Hello");
				
			} else {
				System.out.println(x);
			}
		}
	}
}

