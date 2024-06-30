package PizzaStore;

public class PizzaStoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore store=new NYStylePizzaStore();
		store.orderPizza("cheese");
		store.orderPizza("clam");
		store.orderPizza("");
		
	}

}
