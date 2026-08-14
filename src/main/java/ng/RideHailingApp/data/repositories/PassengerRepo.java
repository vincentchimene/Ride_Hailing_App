package ng.RideHailingApp.data.repositories;

import ng.RideHailingApp.data.model.Passenger;
import ng.RideHailingApp.data.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PassengerRepo extends MongoRepository<Passenger, String> {
}
