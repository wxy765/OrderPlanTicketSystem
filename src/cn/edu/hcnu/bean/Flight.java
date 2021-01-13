package cn.edu.hcnu.bean;

public class Flight {
    private String id;
    private String flightId;//航班编号
    private String planType;//飞机类型
    private int currentSeatNum;//座位数
    private String departureAirPort;//起飞机场
    private String destionAirPort;//目的机场
    private String departureTime;//起飞时间

    public Flight(String id, String flightId, String planType, int currentSeatNum, String departureAirPort, String destionAirPort, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.planType = planType;
        this.currentSeatNum = currentSeatNum;
        this.departureAirPort = departureAirPort;
        this.destionAirPort = destionAirPort;
        this.departureTime = departureTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public int getCurrentSeatNum() {
        return currentSeatNum;
    }

    public void setCurrentSeatNum(int currentSeatNum) {
        this.currentSeatNum = currentSeatNum;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestionAirPort() {
        return destionAirPort;
    }

    public void setDestionAirPort(String destionAirPort) {
        this.destionAirPort = destionAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", flightId='" + flightId + '\'' +
                ", planType='" + planType + '\'' +
                ", currentSeatNum='" + currentSeatNum + '\'' +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", destionAirPort='" + destionAirPort + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
