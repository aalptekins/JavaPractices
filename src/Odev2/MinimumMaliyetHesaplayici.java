package Odev2;

public class MinimumMaliyetHesaplayici {

	public static int fiyatHesapla(int n) {
		if (n <= 12) {
			if (n < 10) {
				return n * 5;
			}
			return 50; // 50 kurus
		} else if (n <= 25) {
			return 100; // 1 lira
		} else {
			int bolum = n / 25;
			int kalan = n - (bolum * 25);

			if (bolum > 12) {
				return 100 * bolum + 100;
			} else if (bolum < 10) {
				return 100 * bolum + kalan * 5;
			} else
				return 100 * bolum + 50;

		}
	}

	public static int ozYinelemeliFiyatHesapla(int n) {
		if (n <= 12) {
			if (n < 10) {
				return n * 5;
			}
			return 50; // 50 kurus
		} else if (n <= 25) {
			return 100; // 1 lira
		} else {
			return ozYinelemeliFiyatHesapla(n - 25) + 100;
		}
	}

	public static void main(String[] args) {
		int n = 768; // Hesaplanacak sayfa sayısı
		int fiyat = fiyatHesapla(n);
		System.out.println("minumum maliyet: " + fiyat + " Kurus");

		int ozYinelemeliFiyat = ozYinelemeliFiyatHesapla(n);
		System.out.println("Ozyinelemeli fonksiyona gore maliyet: " + ozYinelemeliFiyat + " Kurus");
	}
}