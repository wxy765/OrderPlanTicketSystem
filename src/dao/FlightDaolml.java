package dao;

import bean.Flight;

import java.util.Set;

public class FlightDaolml implements IFlightDao {

        @Override
        public void insertFlight(Flight flight) {
            System.out.println("数据到达了DAO层："+flight);
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
