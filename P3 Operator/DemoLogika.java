﻿public class Demologika {
	public static void main (String [] args) {
		//beberapa nilai 
		int i= 37;
		int j= 42;
		int k= 42;

		System.out.println ("Nilai variabel...");
 		System.out.println ("i  = " + i); 
		System.out.println ("j  = " + j); 
		System.out.println ("k  = " + k); 

		//lebih besar dari 
		System.out.println ("Lebih Besar dari...");
		System.out.println ("i > j = " + (i > j)); //false
		System.out.println ("j > i = " + (j > i)); // true
		System.out.println ("k > j = " + (k > j)); //false

		//lebih besar atau sama dengan
		System.out.println ("Lebih Besar Dari atau Sama dengan...");
		System.out.println ("i >= j = " + (i >= j)); //false
		System.out.println ("j >= i = " + (j >= i)); // true
		System.out.println ("k >= j = " + (k >= j)); //true 

		//lebi kecil dari
		System.out.println (" Lebih kecil dari...");
		System.out.println ("i < j = " + (i < j)); //true
		System.out.println ("j < i = " + (j < i)); // false
		System.out.println ("k < j = " + (k < j)); //false

		//lebih kecil atau sama dengan
		System.out.println ("Lebih kecil dari atau sama dengan..");
		System.out.println ("i <= j = " + (i <= j)); //true
		System.out.println ("j <= i = " + (j <= i)); // false
		System.out.println ("k <= j = " + (k <= j)); //true

		//sama dengan
		System.out.println ("Sama dengan...");
		System.out.println ("i == j = " + (i == j)); // false
		System.out.println ("k == j = " + (k == j)); //true 

		//tidak sama dengan 
		System.out.println ("Tidak sama dengan...");
		System.out.println ("i != j = " + (i != j)); //true
		System.out.println ("k != j = " + (k != j));  // false

	}
}