package day39_overridingKurallarý;

public class C01 {

	
public static void staticMethod() {

System.out.println("Parent class private method");
}
 public void privateMethod() {
 System.out.println("Parent Class private method");
}
 public final void  finalMethod() {
	System.out.println("Parent class final method");
}
}
//child class ile parent class ayni package'da ol'
//method'larý access mofier'lari publc, protect