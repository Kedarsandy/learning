package practice;

public class SarswatiVidyalaya {

	int maths;
	int physics;
	int chemistry;
	static int outOfMarks = 100;
	
	public static void main(String[] args) {
		SarswatiVidyalaya Avdhut = new SarswatiVidyalaya();
		SarswatiVidyalaya Raju = new SarswatiVidyalaya();
		SarswatiVidyalaya Ramesh = new SarswatiVidyalaya();
		
		Avdhut.maths= 40;
		Avdhut.physics = 50;
		Avdhut.chemistry = 70;
		
		Raju.maths= 48;
		Raju.physics = 80;
		Raju.chemistry = 60;
		
		Ramesh.maths= 41;
		Ramesh.physics = 56;
		Ramesh.chemistry = 80;
		
		System.out.println("Marks of Avdhut Maths, Physics, Chemistry: " + Avdhut.maths+"/"+outOfMarks + " "+ Avdhut.physics+" "+ Avdhut.chemistry);
		System.out.println("Marks of Raju Maths, Physics, Chemistry: " + Raju.maths + " "+ Raju.physics+" "+ Raju.chemistry);
		System.out.println("Marks of Ramesh Maths, Physics, Chemistry: " + Ramesh.maths + " "+ Ramesh.physics+" "+ Ramesh.chemistry);
	
	}
}
