package ng.RideHailingApp.data.repositories;

import ng.RideHailingApp.data.model.Ride;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RideRepo extends MongoRepository<Ride, String> {
}
