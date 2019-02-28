package com.weather.controller;

import static org.mockito.Mockito.when;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.weather.service.CurrentWeather;
import com.weather.service.WeatherAppService;

@RunWith(SpringRunner.class)
@WebMvcTest(WeatherAppController.class)
public class WeatherAppControllerTest {
	@MockBean
	private WeatherAppService weatherService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getWeather() throws Exception {
		CurrentWeather current = new CurrentWeather();
		current.setName("");
		current.setTemperature(278.79);
		current.setTimestamp(1234);
		current.setWeatherId(721);
		current.setWeatherIcon("50n");
		when(weatherService.getCurrentWeather("uk", "London")).thenReturn(current);
		// Verify request succeed
		Assert.assertEquals(current, weatherService.getCurrentWeather("uk", "London"));
	}
}
