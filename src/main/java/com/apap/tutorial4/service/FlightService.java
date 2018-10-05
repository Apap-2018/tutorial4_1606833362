package com.apap.tutorial4.service;

import java.util.List;
import com.apap.tutorial4.model.FlightModel;

public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlight(FlightModel flight);
	FlightModel findFlight(Long id);
	void updateFlight (FlightModel flight, String flightNumber);
	FlightModel getFlightDetailByFlightNum(String flightNumber);
	List<FlightModel> getFlights();
}
