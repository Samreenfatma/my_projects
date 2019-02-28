package com.weather.service;

public class WeatherResponse {
	private CurrentWeather currentWeather;
	private WeatherForecast weatherForecast;

	public WeatherResponse(CurrentWeather currentWeather,
			WeatherForecast weatherForecast) {
		super();
		this.currentWeather = currentWeather;
		this.weatherForecast = weatherForecast;
	}

	public CurrentWeather getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(CurrentWeather currentWeather) {
		this.currentWeather = currentWeather;
	}

	public WeatherForecast getWeatherForecast() {
		return weatherForecast;
	}

	public void setWeatherForecast(WeatherForecast weatherForecast) {
		this.weatherForecast = weatherForecast;
	}

	@Override
	public String toString() {
		return "WeatherResponse [currentWeather=" + currentWeather
				+ ", weatherForecast=" + weatherForecast + "]";
	}

}
