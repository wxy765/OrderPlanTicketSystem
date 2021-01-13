package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bean.Flight;

import java.util.Set;

public interface IFlightService {
    void insetFlight(Flight flight);

    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(Flight flight);
}