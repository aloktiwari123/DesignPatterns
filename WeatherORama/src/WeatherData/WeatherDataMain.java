package WeatherData;

public class WeatherDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData publisher =new WeatherData();
		CurrentDisplay display=new CurrentDisplay(new UIDisplay()); 
		display.subscribe(publisher);
		publisher.setNewMeasurements(0, 0, 0);
		publisher.setNewMeasurements(1f, 0, 0);
		publisher.setNewMeasurements(1f, 2f, 3f);
	}

}
