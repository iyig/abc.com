package day04_ÝncrementDecrement;

public class C05_incrementDecrement {

	public static void main(String[] args) {
		// atama islemi olursa sayinin degeri kalýcý olarak degisir
		// atama islemi olmadan yapýlan toplama cýkarma vs islemler sadece o satirda yapilir
		// sayinin degerini kalici olarak degistirmez
		 
		int sayi=10;
		
		int sayi1 = 10;
		System.out.println(sayi1+=5);
		//bu islem sayi1'in degerini 5 artirip sayi1'e assign ediyor
		//dolaysiyla sayi1'in degeri kalici olarak degisiyor
         System.out.println(sayi1);	//15
         
         
        System.out.println(sayi1+12);//27
         
		System.out.println(sayi1);// 15
		
		sayi1++;	
		// her ne kadar = isareti gorunmese de sayi1++ isleminde assigne vardir
		//dolaysiyla deger kalýcý olarak degisir
		System.out.println(sayi1);
		
	}
	
}

