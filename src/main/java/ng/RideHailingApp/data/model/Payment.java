package ng.RideHailingApp.data.model;

import lombok.Data;

@Data
public class Payment {
    private double amount;
    private String paymentMethod;
    private String paymentStatus;
}
