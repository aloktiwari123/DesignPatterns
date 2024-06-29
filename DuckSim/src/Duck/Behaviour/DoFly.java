package Duck.Behaviour;

public class DoFly implements FlyBehaviour{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.print("FlyWithWings");
	}

	@Override
	public void fly(String s) {
		// TODO Auto-generated method stub
		System.out.print(s);
	}

}
