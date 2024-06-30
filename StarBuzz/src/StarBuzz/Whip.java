package StarBuzz;

public class Whip extends Condiments {

	
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+","+"Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if(beverage.getSize()==Size.TALL) {
			return beverage.cost()+.60;
		}else if(beverage.getSize()==Size.GRANDI) {
			return beverage.cost()+.80;
		}else if(beverage.getSize()==Size.VENTI) {
			return beverage.cost()+.100;
		}
		
		return beverage.cost();
	}

}
