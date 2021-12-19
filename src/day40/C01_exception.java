package day40;

public class C01_exception {

	public static void main(String[] args) {
		
		
		
		int a=20;
		int b=0;
		
		try {
		
		System.out.println("sayýlarin bolum :"+a/b);
	

		
		}catch (ArithmeticException e) {
		System.out.println("Sifira bolum yapilamaz");
		//System.out.println(e.getMessage());	  // / by zero exception'in kaynagini
		e.printStackTrace();	
       //java.lang.ArithmeticException:/ by zero
		//   atday40.C01_exception.main
		}

		System.out.println("Görev tamamlandi");	

	}
	
	
}