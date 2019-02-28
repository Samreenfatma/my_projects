package com.weather.service;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class WeatherEntry implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Instant timestamp;

	private double temperature;

	private Integer weatherId;

	private String weatherIcon;

	private double speed;

	private double pressure;

	public Instant getTimestamp() {
		return this.timestamp;
	}

	@JsonSetter("dt")
	public void setTimestamp(long unixTime) {
		this.timestamp = Instant.ofEpochMilli(unixTime * 1000);
	}

	/**
	 * Return the temperature in Kelvin (K).
	 */
	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getPressure() {
		return this.pressure;
	}

	@JsonProperty("main")
	public void setMain(Map<String, Object> main) {
		setTemperature(Double.parseDouble(main.get("temp").toString()));
		setPressure(Double.parseDouble(main.get("pressure").toString()));
	}

	@JsonProperty("wind")
	public void setwind(Map<String, Object> wind) {
		setSpeed(Double.parseDouble(wind.get("speed").toString()));
	}

	public Integer getWeatherId() {
		return this.weatherId;
	}

	public void setWeatherId(Integer weatherId) {
		this.weatherId = weatherId;
	}

	public String getWeatherIcon() {
		return this.weatherIcon;
	}

	public double getSpeed() {
		return this.speed;
	}

	public void setWeatherIcon(String weatherIcon) {
		this.weatherIcon = weatherIcon;
	}

	@JsonProperty("weather")
	public void setWeather(List<Map<String, Object>> weatherEntries) {
		Map<String, Object> weather = weatherEntries.get(0);
		setWeatherId((Integer) weather.get("id"));
		setWeatherIcon((String) weather.get("icon"));
	}

	@Override
	public String toString() {
		return "WeatherEntry [timestamp=" + timestamp + ", temperature="
				+ temperature + ", weatherId=" + weatherId + ", weatherIcon="
				+ weatherIcon + ", speed=" + speed + ", pressure=" + pressure
				+ "]";
	}

}
