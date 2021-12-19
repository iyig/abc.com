package day04_�ncrementDecrement;

public class C06_PreincrementPostincrement {

	public static void main(String[] args) {
		//pre�ncfrement ve post increment sadece sayi++ veya sayi-- yazimi i�in gecerlidir
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		System.out.println(sayi); //13
		
		
		
		System.out.println(sayi++); // 13 bu satirda iki islem var
		                            // bir art�rma , bir de yazd�rma
		System.out.println(sayi); // 14
		
		// �nce art�rmak sonra yazd�rmak isterseniz ++sayi
		// once yazdirmak sonra artirmak isterseniz sayi++
		
		System.out.println(++sayi);// 15

	}

}
