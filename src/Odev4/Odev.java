package Odev4;

import java.util.Scanner;

public class Odev {

	public static boolean isPrime(int number) {
		int counter = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				counter++;
			}
		}
		if (counter == 0)
			return true;
		else
			return false;
	}

	public static int fibonacciTotal(int number) {
		int n1 = 0, n2 = 1, n3 = 0;
		for (int i = 0; i < number; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n3;
	}

	public static boolean isPerfect(int number) {
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		while (true) {
			System.out.println(
					"Welcome to my application... (:\nThis app consists of 3 different methods.\n1-Check the number if it is Prime?\n"
							+ "2-Tools that calculates N members of fibonacci\n3-Check the number if it is Perfect?\nYou can enter '0' for logging out.");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == 0)
				break;
			while (true) {
				if (choice == 1) {
					while (true) {
						System.out.println("Enter the number: ");
						int number = sc.nextInt();
						if (number == 0)
							break;
						else if (number == 1)
							System.out.println("This is NOT a prime number");
						else {
							boolean sonuc = isPrime(number);

							if (sonuc)
								System.out.println("YES! This is a prime number");
							else
								System.out.println("This is NOT a prime number.");
						}

					}
					break;
				}

				else if (choice == 2) {
					while (true) {
						System.out.println("Enter the number: ");
						int number = sc.nextInt();
						if (number == 0)
							break;
						else {
							int total = fibonacciTotal(number);
							System.out.println(
									"The sum of first " + number + " members of Finonacci sequence is  " + total + ".");
						}
					}
					break;
				}

				else if (choice == 3) {
					while (true) {
						System.out.println("Enter the number: ");
						int number = sc.nextInt();
						if (number == 0)
							break;
						else {
							boolean sonuc = isPerfect(number);

							if (sonuc)
								System.out.println("YES! This is a perfect number");
							else
								System.out.println("This is NOT a perfect number");
						}
					}
					break;
				} else if (choice == 0) {
					System.out.println("Thank u. We hope to see u again :)");
					break;
				} else {
					System.out.println("You entered an invalid number. Please enter between 1-3..!");
				}

			}

		}

	}
}
