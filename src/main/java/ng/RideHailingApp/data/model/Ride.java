package ng.RideHailingApp.data.model;

import lombok.Data;

@Data
public class Ride {
    private String rideId;
    private Passenger pasenger;
    private Driver driver;
    private String pickupLocation;
    private String dropOffLocation;
    private double price;
    }
