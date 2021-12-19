package day35_encapsulation_inhirates;

public class C01 {

	
 private  double not=49.9;
	private boolean gecerMi=false;
	public double getNot() {
		return not;
	}
	public void setNot(double not) {
		this.not = not;
	}
	
	
	
	public boolean isGecerMi() {
		
	if(not>=50)	
		gecerMi=true;
	
		
		
		
		return gecerMi;
	}
}
	