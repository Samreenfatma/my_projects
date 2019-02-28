package com.weather.service;

public class CurrentWeather extends WeatherEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CurrentWeather [name=" + name + "]";
	}
}
