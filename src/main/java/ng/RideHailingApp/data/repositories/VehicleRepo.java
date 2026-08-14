package ng.RideHailingApp.data.repositories;

import ng.RideHailingApp.data.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepo extends MongoRepository<Vehicle, String> {
}
