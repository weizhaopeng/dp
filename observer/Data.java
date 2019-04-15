package observer;
import java.util.*;

public class Data implements Subject {
	private ArrayList observers = new ArrayList();
	private WeatherData wd;
		
	public Data() {
        wd = new WeatherData();
	}

	//TODO:without the konwledge of ArrayList, need learn	
	public boolean addObserver(Observer o) {
		if (o != null) {
			observers.add(o);
			return true;
		}
		else 
			return false;
	}
	
	public boolean removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0) {
			observers.remove(index);
			return true;
		}
		else
			return false;
	}

	public void notifyObservers() throws NullPointerException {
		for (int i = 0; i < observers.size(); i++) {
			try {
				Observer obs = (Observer) observers.get(i);
				obs.update(wd);
			}
			catch (Exception ex) {
				System.out.println("无效");
			}
		}
	}
	
	public void setChange(int temperatureIn, int humidityIn, int windSpeedIn) {
		wd.setTemperature(temperatureIn);
		wd.setHumidity(humidityIn);
		wd.setWindSpeed(windSpeedIn);
		notifyObservers();
	}
}

class WeatherData {
	private int temperature;
	private int humidity;
	private int windSpeed;
	
	void setTemperature(int temperatureIn) {
		this.temperature = temperatureIn;
	}

	int getTemperature() {
		return this.temperature;
	}

	void setHumidity(int humidityIn) {
		this.humidity = humidityIn;
	}
	int getHumidity() {
		return this.humidity;
	}

	void setWindSpeed(int windSpeedIn) {
		this.windSpeed = windSpeedIn;
	}
	int getWindSpeed() {
		return this.windSpeed;
	}
}



