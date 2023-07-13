package ch09;

import java.util.Scanner;

public class CalculatorApp {
	
	public static int topla(int x,int y) {
		return x+y;
	}
	public static int cikar(int x,int y) {
		return x-y;
	}
	public static int carp(int x,int y) {
		return x*y;
	}
	public static int bol(int x,int y) {
		return x/y;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Yapmak istediginiz islemi giriniz:\n1-Topla\n2-Cikar\n3-Carp\n4-Bol");
		int secim = sc.nextInt();
		System.out.println("Birinci sayiyi giriniz : ");
		int sayi1=sc.nextInt();
		System.out.println("Ikinci sayiyi giriniz : ");
		int sayi2=sc.nextInt();
		
		switch(secim) {
		case 1: System.out.println(topla(sayi1,sayi2));break;
		case 2: System.out.println(cikar(sayi1,sayi2));break;
		case 3: System.out.println(carp(sayi1,sayi2));break;
		case 4: System.out.println(bol(sayi1,sayi2));break;
		default:System.out.println("hatali giris yaptiniz. lutfen 1-4 arasibda secim yapiniz.!");break;
		}
		
	}

}
