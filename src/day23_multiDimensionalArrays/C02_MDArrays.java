package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		// MultiDimensional Array'lar ic ice konulmus array'lar demektir
		// Array olusturmak icin iki yontemimiz vardi
		// 1.yontem once declare edip sonra deger atama
		
		int arr[][]=new int [3][2]; //outer array'i 3 elemanli
		                            //her bir inner array ise 2 elemanli olan MDArray olusturur
		// Bu yontemle olusturdugumuzda inner array'larin hepsi ayni boyutta olmalidir
		
		System.out.println(Arrays.toString(arr)); //direk outer array'i yazdýrmak istedigimizde
                                                     //icindeki elemanlar non-primitive oldugundan
                                                 //referanslari yazdirilir
		                                           //[[I@515f550a, [I@626b2d4a, [I@5e91993f]

		System.out.println(Arrays.toString(arr[1]));//[0,0]
		System.out.println(Arrays.toString(arr[2]));//[0,0]
	
	
		System.out.println(Arrays.deepToString(arr));
		
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		System.out.println(Arrays.deepToString(arr));
		
		//2.yontem hem declare edip hem de deger atama
		
	 int arr2[][]= { {0},{1,2,3},{6,7,8,9,} };	
		System.out.println(Arrays.deepToString(arr2));
	
		System.out.println(Arrays.toString (arr2[1]));
		System.out.println(arr2[2][1]);//7
		
	}
	
	

}
