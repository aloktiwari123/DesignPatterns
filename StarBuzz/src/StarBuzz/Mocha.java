package StarBuzz;

public class Mocha extends Condiments {
	
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+","+"Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if(beverage.getSize()==Size.TALL) {
			return beverage.cost()+.30;
		}else if(beverage.getSize()==Size.GRANDI) {
			return beverage.cost()+.40;
		}else if(beverage.getSize()==Size.VENTI) {
			return beverage.cost()+.50;
		}
		
		return beverage.cost();
	}

}
