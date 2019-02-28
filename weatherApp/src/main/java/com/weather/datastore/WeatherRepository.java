package com.weather.datastore;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface WeatherRepository extends CrudRepository<UserEntry, Long> {
	UserEntry findByUser(@Param("user") String user);
}
