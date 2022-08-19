package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PaymentRepo extends JpaRepository<Payment,Long> {
}
