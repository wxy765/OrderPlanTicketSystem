public class Flight {
    private String id;
    private String planType;//飞机类型
    private String departurAirPort;//出发机场
    private String destinationAirPort;//目的机场
    private String departureTime;//出发时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getDeparturAirPort() {
        return departurAirPort;
    }

    public void setDeparturAirPort(String departurAirPort) {
        this.departurAirPort = departurAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
