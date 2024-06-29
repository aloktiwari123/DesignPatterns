package Duck.Behaviour;

public class DoNotFly implements FlyBehaviour {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.print("Do not fly");
	}

	@Override
	public void fly(String s) {
		// TODO Auto-generated method stub
		System.out.print(s);
	}

}
