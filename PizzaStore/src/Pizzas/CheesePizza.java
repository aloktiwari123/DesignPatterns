package Pizzas;

import Ingredients.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {

	public CheesePizza() {
		name="Cheese Pizza";
	}
	
	PizzaIngredientsFactory pizzaIngredientsFactory;
	
	public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
		this.pizzaIngredientsFactory=pizzaIngredientsFactory;
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(name+" Preparing");
		dough=pizzaIngredientsFactory.createDough();
		clam=pizzaIngredientsFactory.createClam();
		pepperoni=pizzaIngredientsFactory.createPepperoni();
		cheese=pizzaIngredientsFactory.createCheese();
	}

}
