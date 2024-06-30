package Pizzas;

import Ingredients.Cheese;
import Ingredients.Clams;
import Ingredients.Dough;
import Ingredients.Pepperoni;
import Ingredients.Veggie;

public abstract class Pizza {

	Dough dough;
	Veggie veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void prepare();
	
	public void bake() {
		System.out.println(name+" Baked");
	}
	
	public void cut() {
		System.out.println(name+" Cut");
	}
	
	public void box() {
		System.out.println(name+" Boxed");
	}
	
}
