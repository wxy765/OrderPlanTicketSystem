package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaolml implements IFlightDao {

        @Override
        public void insertFlight(Flight flight) throws SQLException {
            //插入数据库
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "opts";
            String password = "opts1234";
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, flight.getId());
            pstmt.setString(2, flight.getFlightId());
            pstmt.setString(3, flight.getPlanType());
            pstmt.setInt(4, flight.getCurrentSeatNum());
            pstmt.setString(5, flight.getDepartureAirPort());
            pstmt.setString(6, flight.getDestionAirPort());
            pstmt.setString(7, flight.getDepartureTime());

            pstmt.executeLargeUpdate();
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
