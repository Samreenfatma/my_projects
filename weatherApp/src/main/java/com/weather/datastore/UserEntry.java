package com.weather.datastore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEntry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String user;
	private String city;

	public UserEntry() {
	}

	public UserEntry(String user, String city) {
		super();
		this.user = user;
		this.city = city;
	}

	@Override
	public String toString() {
		return "WeatherData [id=" + id + ", user=" + user + ", city=" + city
				+ "]";
	}

}
