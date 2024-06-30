package PizzaStore;

import PizzaFactory.PizzaFactory;
import PizzaFactory.SimplePizzaFactory;
import Pizzas.Pizza;

public class SimplePizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		PizzaFactory pizzaFactory=new SimplePizzaFactory();
		return pizzaFactory.createPizza(type);
	}

	
	
}
