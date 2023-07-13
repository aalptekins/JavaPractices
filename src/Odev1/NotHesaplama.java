package Odev1;

import java.util.Scanner;

public class NotHesaplama {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ogrenci sayisini girin: ");
		int ogrenciSayisi = scanner.nextInt();

		for (int i = 1; i <= ogrenciSayisi; i++) {
			System.out.println("Ogrenci " + i);

			System.out.print("Adini girin: ");
			String ad = scanner.next();

			System.out.print("Vize notunu girin: ");
			int vizeNotu = scanner.nextInt();

			System.out.print("Final notunu girin: ");
			int finalNotu = scanner.nextInt();

			
			double genelNot = (vizeNotu * 0.4) + (finalNotu * 0.6);

			
			String harfNotu;

			if (genelNot >= 90)
				harfNotu = "AA";
			else if (genelNot >= 80) 
				harfNotu = "BA";
			else if (genelNot >= 70) 
				harfNotu = "BB";
			else if (genelNot >= 60) 
				harfNotu = "CB";
			else if (genelNot >= 50)
				harfNotu = "CC";
			else if (genelNot >= 40)
				harfNotu = "DC";
			else if (genelNot >= 30)
				harfNotu = "DD";
			else 
				harfNotu = "FF";
			

			// Sonuçların ekrana yazdırılması
			System.out.println("Genel Not: " + genelNot);
			System.out.println("Harf Notu: " + harfNotu);

			System.out.println();
		}
		scanner.close();
	}
}
