package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_File�nputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Java'da bir dosyaya ulasmak istedigimizde File�NputStream class�ndan yardim aliriz
        //
	
	FileInputStream fis =new FileInputStream("src\\day40\\yazi.txt");
	//java bu kodda olasi bir problem ongruyor
	// ve bu problee karsi ne yapmasi gerektigini bize soruyor
	//( Yani alti cizilen her kod CTE degildir)
	
	// Bunun icin iki durum sozkonusu
	// 1- try catch kullanarak bu problemi HANDLE edip java'nin yoluna devam etmesini saglayabiliriz
	// 2- Eger dosya okunamiyorsa kod calismasin istiyorsak olayin farkinda oldugumuzu 
	// ve sorumlulugun bizde oldugunu Java'ya soylemeliyiz
	
	System.out.println("g�rev tamamland�");
	}

}
