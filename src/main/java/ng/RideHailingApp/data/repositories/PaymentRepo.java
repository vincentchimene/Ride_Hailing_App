package ng.RideHailingApp.data.repositories;

import ng.RideHailingApp.data.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepo extends MongoRepository<Payment, String> {
}
