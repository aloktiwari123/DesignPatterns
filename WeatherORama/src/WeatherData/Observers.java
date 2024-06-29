package WeatherData;

public interface Observers {

	public void  update();
	
	public void subscribe(Subject publisher);
	
	public void unsubscribe();
}
