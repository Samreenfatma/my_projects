package com.weather.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class WeatherForecast {
	private String name;

	private List<WeatherEntry> entries = new ArrayList<>();

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("weatherEntries")
	public List<WeatherEntry> getEntries() {
		return this.entries;
	}

	@JsonSetter("list")
	public void setEntries(List<WeatherEntry> entries) {
		this.entries = entries;
	}

	@JsonProperty("city")
	public void setCity(Map<String, Object> city) {
		setName(city.get("name").toString());
	}

	@Override
	public String toString() {
		return "WeatherForecast [name=" + name + ", entries=" + entries + "]";
	}
	
	
}
