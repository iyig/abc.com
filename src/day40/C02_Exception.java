package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		// Kullanicidan istedigi kadar sayi alip
		// bu sayilari toplayan bir program yapiniz
		
		int sayi=0;
		int toplam=0;
		int count=0;
	
		
		Object secim;
		while(count<10000) {
			System.out.println("Lütfen toplamak icin bir sayi yaziniz\nBitirmek icin sayi disinda bir tusa basiniz");
	     Scanner scan = new Scanner(System.in);
		try {
			
			while(count<10000) {
			}
	     
		}catch (InputMismatchException e) {
	     sayi=scan.nextInt();
	     toplam+=sayi;
	    count++;
	     
	     System.out.println("sayilarin toplami :" +toplam);
		
		}
		}
	}
}
		
	


