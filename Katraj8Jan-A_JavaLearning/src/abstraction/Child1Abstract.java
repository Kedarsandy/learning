package abstraction;

public class Child1Abstract extends ChildAbstract {


	@Override
	void specificIPOShareNumbers() {
		// TODO Auto-generated method stub
		
	}
	


	public static void main(String[] args) {
		Child1Abstract obj = new Child1Abstract();
		obj.shareSell();
		obj.buyingShare();
		obj.buyingAndSellingOnSpecificStockExchange();
		obj.specificIPOShareNumbers();
	}	
}
