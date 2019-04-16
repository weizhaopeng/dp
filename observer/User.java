package observer;

public class User implements Observer, Display {
	private WeatherData wd = new WeatherData();

	public void update(Object o) {
		if (o instanceof WeatherData) {
			wd.setHumidity(((WeatherData) o).getHumidity());
			wd.setTemperature(((WeatherData) o).getTemperature());
			wd.setWindSpeed(((WeatherData) o).getWindSpeed());
			displayData(wd);
		}
	}

	public void displayData(WeatherData wd) {
		System.out.println("temperature is :"+wd.getTemperature());
		System.out.println("humidity is :"+wd.getHumidity());
		System.out.println("wind speed is :"+wd.getWindSpeed());
	}
}

			
