package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.impl.IFlightService;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    @Override
    public void insetFlight(Flight flight) {
        System.out.println("界面传来的航班信息:"+flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
