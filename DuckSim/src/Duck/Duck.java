package Duck;

import Duck.Behaviour.FlyBehaviour;
import Duck.Behaviour.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	QuackBehaviour quackBehaviour;
	
	public Duck() {
		
	}
	
	public void performFly() {
		flyBehaviour.fly("hey");
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.print("Duck Swims");
	}
	
}
