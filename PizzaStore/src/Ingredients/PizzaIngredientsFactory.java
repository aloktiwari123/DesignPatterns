package Ingredients;

public interface PizzaIngredientsFactory {

	public Dough createDough();
	public Clams createClam();
	public Pepperoni createPepperoni();
	public Cheese createCheese();
	public Veggie[] createVeggies();
}
