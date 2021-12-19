package day26_forEachLoop_constructor;

public class CarRunner {

	public static void main(String[] args) {
		// Car class'inden bir obje olusturalim
		
Car              car1          =      new         Car();
//class ismi     obje ismi     atama  keyword     constructor call
	System.out.println(car1.km +" " + car1.model + " "  +car1.yil);// 0 null null 2000

	}
}
	
	
	// Bir obje olustururken eger obje icin kendi classinda belirlenen degerleri kullanmak istiyorsam
	// hic bir degeri kendim atamadan obje olusturabilirim
	// bu durumda hic bir parametre kullanilmadigi icin default constructor yeterli olacaktir
	// Eger obje olusturdugum classdaki degerleri kullanmak yerine kendi degerlerimle bir obje o
	// olusturmak istersem o zaman parametreli constructor olusturmam gerekir
	
	//Car car2= new Car("Kirmizi", "Corolla");
  //Car classinda iki String parametresi olan bir constructor olmadigi icin
	// bu obje olusturmayi