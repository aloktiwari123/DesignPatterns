package PizzaFactory;

import Pizzas.*;

public class SimplePizzaFactory implements PizzaFactory {

	public Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new CheesePizza(); 
		}else if(type.equals("clam")) {
			return new ClamPizza();
		}else {
			return new SimplePizza();
		}
	}
}
