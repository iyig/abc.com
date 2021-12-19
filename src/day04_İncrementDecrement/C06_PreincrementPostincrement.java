package day04_ÝncrementDecrement;

public class C06_PreincrementPostincrement {

	public static void main(String[] args) {
		//preÝncfrement ve post increment sadece sayi++ veya sayi-- yazimi için gecerlidir
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		System.out.println(sayi); //13
		
		
		
		System.out.println(sayi++); // 13 bu satirda iki islem var
		                            // bir artýrma , bir de yazdýrma
		System.out.println(sayi); // 14
		
		// önce artýrmak sonra yazdýrmak isterseniz ++sayi
		// once yazdirmak sonra artirmak isterseniz sayi++
		
		System.out.println(++sayi);// 15

	}

}
