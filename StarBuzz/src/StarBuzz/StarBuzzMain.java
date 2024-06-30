package StarBuzz;

import StarBuzz.Beverage.Size;

public class StarBuzzMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage=new Espresso();
		beverage.setSize(Size.GRANDI);
		beverage=new Mocha(beverage);
		beverage=new Mocha(beverage);
		System.out.print(beverage.getDescription()+": $ "+beverage.cost()+"\n");
		
		Beverage beverage1=new DarkRoast();
		beverage1.setSize(Size.TALL);
		beverage1=new Whip(beverage1);
		beverage1=new Mocha(beverage1);
		System.out.print(beverage1.getDescription()+": $ "+beverage1.cost()+"\n");
		
	}

}
