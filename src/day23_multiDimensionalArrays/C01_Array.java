package day23_multiDimensionalArrays;

public class C01_Array {

	public static void main(String[] args, int sayac) {
		// Verilen bir array'den istenen degere sahip elementleri silip
		//kalani yteni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int silinecekEleman=11;
		
		// array'de yeni elelman ekleyemeyiz veya var olan elemenlar� silemeyiz
		// cunku array'in declare edilen uzunlugu DEG�SMEZ
		
		// bU soruda istenen sildigimizde geriye kac element kaliyor bulmamiz lazim
		// silenecek sayi adedini bulal�m
		
		
		for (int i = 0; i < arr.length; i++)
			if (arr[i]==silinecekEleman) 
				sayac++;
				
			}
	}
	
