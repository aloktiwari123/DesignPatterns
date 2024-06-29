package WeatherData;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

	List<Observers>subs=new ArrayList<>();
	Float temperature;
	Float humidity;
	Float pressure;
	
	public Float getTemperature() {
		return temperature;
	}

	public Float getHumidity() {
		return humidity;
	}


	public Float getPressure() {
		return pressure;
	}


	
	
	public void addsubs(Observers obv) {
		subs.add(obv);
	}
	
	public void removeSubs(Observers obv) {
		subs.remove(obv);
	}
	
	public void notifySubs() {
		for(Observers obv:subs) {
			obv.update();
		}
	}
	
	public void measurementChanged() {
		notifySubs();	
	}
	
	public void setNewMeasurements(float temp, float humid, float pressure) {
		this.temperature=temp;
		this.humidity=humid;
		this.pressure=pressure;
		measurementChanged();
	}
}
