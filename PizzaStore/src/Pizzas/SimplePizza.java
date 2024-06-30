package Pizzas;

import Ingredients.PizzaIngredientsFactory;

public class SimplePizza extends Pizza{

	public SimplePizza() {
		name="Simple Pizza";
	}
	
	PizzaIngredientsFactory pizzaIngredientsFactory;
	
	public SimplePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
		this.pizzaIngredientsFactory=pizzaIngredientsFactory;
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.print(name+" Preparing");
		dough=pizzaIngredientsFactory.createDough();
		veggies=pizzaIngredientsFactory.createVeggies();
		//clam=pizzaIngredientsFactory.createClam();
		//pepperoni=pizzaIngredientsFactory.createPepperoni();
		//cheese=pizzaIngredientsFactory.createCheese();
	}
}
