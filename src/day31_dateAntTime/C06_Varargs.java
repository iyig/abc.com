package day31_dateAntTime;

public class C06_Varargs {

	public static void main(String[] args) {
		// verilen sayilari toplayan bir method olusturmak istiyorum
		// 
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		
		topla(a,b);  // iki sayinin toplami : 30
		topla(a,b,c);
		topla(a,b,c,d);
		topla(a,b,c,d,e);
		topla(a,b,c,d,e,f);
		
		
		// suana kadar gordugumuz tekniklerle degisken sayida parametreli tek bir method olusturamayiz
		

	}

	private static void topla(int... a) {
		
		System.out.println("varargs calisir");
	}

	private static void topla(int a, int b, int c) {
		System.out.println("uc sayinin toplami : " + (a+b+c));
		
	}

	private static void topla(int a, int b) {
		
		System.out.println("iki sayinin toplami : " + (a+b));
		
	}

}