package WeatherData;

public class UIDisplay implements Display{

	@Override
	public void display(float temp, float humid, float pressure) {
		// TODO Auto-generated method stub
		StringBuilder st=new StringBuilder();
		st.append("Temperature:").append(temp).append(System.lineSeparator());
		st.append("Humidity:").append(humid).append(System.lineSeparator());
		st.append("Pressure:").append(pressure).append(System.lineSeparator());
		System.out.print(st);
	}	

}
