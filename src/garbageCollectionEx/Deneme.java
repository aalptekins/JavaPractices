package garbageCollectionEx;

import java.util.Iterator;

public class Deneme {

	
	
	public static void main(String[] args) {

		String[] students;
		
		for (int i = 0; i < 1_000; i++) {
			
			Student student = new Student(i, null, null, i+99);
		}
	}

}
