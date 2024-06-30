package PizzaStore;

import PizzaFactory.NYPizzaFactory;
import PizzaFactory.PizzaFactory;
import Pizzas.Pizza;

public class NYStylePizzaStore extends PizzaStore {

	

	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		PizzaFactory pizzaFactory=new NYPizzaFactory();
		return pizzaFactory.createPizza(type);
	}

	
}
