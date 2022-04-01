package abstraction;

public abstract class ParentAbstract {

	public ParentAbstract(int a) {
		System.out.println("it is constructor of abstract class");
	}
	
	public void shareSell() {
		System.out.println("Selling Share");
	}
	
	public void buyingShare() {
		System.out.println("Buying Share");
	}
	
	 abstract void buyingAndSellingOnSpecificStockExchange();
	 
	 
	 public static void main(String[] args) {

	}
}
