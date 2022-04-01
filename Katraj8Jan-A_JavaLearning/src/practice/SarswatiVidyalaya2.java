package practice;

public class SarswatiVidyalaya2 {

	int maths;
	int chem;
	int phy;
	
	public void general(int maths, int chem, int phy) {
		this.maths=maths;
		this.chem=chem;
		this.phy=phy;
		
		System.out.println("Marks Of Student: ");
		System.out.println("Maths :" + maths);
		System.out.println("Chemistry :" + chem);
		System.out.println("Physics :" + phy);
		System.out.println(" ");
	}
	
	public void avdhut() {
		System.out.println("Avdhut");
		general(80,90,100);
	}
	
	public void raju() {
		System.out.println("Raju");
		general(50,60,80);
	}
	
	public void ramesh() {
		System.out.println("Ramesh");
		general(60,50,88);
	}
	public static void main(String[] args) {
		SarswatiVidyalaya2 av= new SarswatiVidyalaya2();
		av.avdhut();
		av.raju();
		av.ramesh();
	}
}
