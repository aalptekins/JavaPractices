package Odev4;

import java.util.Arrays;
import java.util.Scanner;

public class AsalSayilar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int n = scanner.nextInt();

        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        System.out.println(n+" 'a kadar olan asal sayilar:");
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
