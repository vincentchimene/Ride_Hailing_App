package ng.RideHailingApp.data.repositories;

import ng.RideHailingApp.data.model.Driver;
import ng.RideHailingApp.data.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DriverRepo extends MongoRepository<Driver, String> {
}
