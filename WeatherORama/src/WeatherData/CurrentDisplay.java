package WeatherData;

public class CurrentDisplay implements Observers{

	WeatherData publisher;
	Float temperature;
	Float humidity;
	Float pressure;
	Display display;
	
	CurrentDisplay(Display display){
		this.display=display;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.temperature=publisher.getTemperature();
		this.humidity=publisher.getHumidity();
		this.pressure=publisher.getPressure();
		display.display(temperature,humidity, pressure);
	}

	@Override
	public void subscribe(Subject publisher) {
		// TODO Auto-generated method stub
		this.publisher=(WeatherData) publisher;
		publisher.addsubs(this);
	}

	@Override
	public void unsubscribe() {
		// TODO Auto-generated method stub
		publisher.removeSubs(this);
	}

}
