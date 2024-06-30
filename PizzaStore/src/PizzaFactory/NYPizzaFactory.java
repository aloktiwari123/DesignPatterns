package PizzaFactory;

import Ingredients.NYPizzaIngredientsFactory;
import Ingredients.PizzaIngredientsFactory;
import Pizzas.CheesePizza;
import Pizzas.ClamPizza;
import Pizzas.Pizza;
import Pizzas.SimplePizza;

public class NYPizzaFactory implements PizzaFactory {

	Pizza pizza;
	PizzaIngredientsFactory pizzaIngredientsFactory=new NYPizzaIngredientsFactory();
	
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")) {
			pizza=new CheesePizza(pizzaIngredientsFactory); 
			pizza.setName("NYCheesePizza");
		}else if(type.equals("clam")) {
			pizza=new ClamPizza(pizzaIngredientsFactory);
			pizza.setName("NYClamPizza");
		}else {
			pizza=new SimplePizza(pizzaIngredientsFactory);
			pizza.setName("NYSimplePizza");
		}
		return pizza;
	}

}
