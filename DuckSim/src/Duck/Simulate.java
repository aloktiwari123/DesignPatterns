package Duck;

import Duck.Behaviour.DoFly;
import Duck.Behaviour.DoQuack;

public class Simulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck=new ModelDuck();
		duck.setFlyBehaviour(new DoFly());
		duck.setQuackBehaviour(new DoQuack());
		duck.performFly();
		duck.performQuack();
	}

}
