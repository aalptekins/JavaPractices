package Odev4;

import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] args) {

		SieveofEratosthenes soe = new SieveofEratosthenes();
		System.out.println("Lütfen pozitif bir tam sayi giriniz:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		soe.countNumberOfPrimesUpTo(n);

	}

	void countNumberOfPrimesUpTo(int n) {
		boolean[] list = new boolean[n];
		Arrays.fill(list, true);

		for (int i = 2; i < n; i++) {
			if (list[i] == true) {
				for (int j = 2; i * j <= n; j++) {
					list[i*j] = false;
				}
			}
			
			
		}
		
	}

}
