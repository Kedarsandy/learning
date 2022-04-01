package practice;

public class SarswatVidyalaya3 {

	int maths;
	int chem;
	int phy;
	
	public SarswatVidyalaya3(int maths, int chem, int phy){
		this.maths=maths;
		this.chem=chem;
		this.phy=phy;
	}
	
	public void m1() {
		System.out.println("Maths :"+ maths);
		System.out.println("chem  :" + chem);
		System.out.println("phy   :" + phy);
		System.out.print(" "+"Total Marks Of Student");
	}
	
	public static void main(String[] args) {
		SarswatVidyalaya3 Tina = new SarswatVidyalaya3(00,5,6);
		SarswatVidyalaya3 Meena = new SarswatVidyalaya3(10,5,6);
		SarswatVidyalaya3 Avdhut = new SarswatVidyalaya3(100,99,90);
		
		Avdhut.m1();
		System.out.println(Avdhut.maths+ Avdhut.phy+ Avdhut.chem);
		
		Meena.m1();
		System.out.println(Meena.maths+ Meena.phy+ Meena.chem);
		
		Tina.m1();
		System.out.println(Tina.maths+ Tina.phy +Tina.chem);
	}
	
}
