package WeatherData;

public interface Subject {
	public void addsubs(Observers obv);
	
	public void removeSubs(Observers obv);
	
	public void notifySubs();
}
