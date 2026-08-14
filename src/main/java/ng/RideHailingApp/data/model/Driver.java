package ng.RideHailingApp.data.model;

import lombok.Data;

@Data
public class Driver extends User {
    private double rating;
    private boolean isAvailable;
}
