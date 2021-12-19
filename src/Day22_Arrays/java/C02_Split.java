package Day22_Arrays.java;

public class C02_Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok guzel"
		// cumlesinin kelimelerini ters sirada yazdirin
		
		String cumle="Java ogrenmek cok guzel";

		String kelimeler[]=cumle.split("");
		
		System.out.println(Arrays.toString(kelimeler));
	}

}
