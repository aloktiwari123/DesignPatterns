package Pizzas;

import Ingredients.PizzaIngredientsFactory;

public class ClamPizza extends Pizza {

	public ClamPizza() {
		name="Clam Pizza";
	}
	
	PizzaIngredientsFactory pizzaIngredientsFactory;
	
	public ClamPizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
		this.pizzaIngredientsFactory=pizzaIngredientsFactory;
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.print(name+" Preparing");
		dough=pizzaIngredientsFactory.createDough();
		clam=pizzaIngredientsFactory.createClam();
		pepperoni=pizzaIngredientsFactory.createPepperoni();
		cheese=pizzaIngredientsFactory.createCheese();
	}
}
