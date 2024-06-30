package Ingredients;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FreshClam();
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new RegiaoCheese();
	}

	@Override
	public Veggie[] createVeggies() {
		// TODO Auto-generated method stub
		return new Veggie[] {new Onion(),new Garlic()};
	}

}
