package kg.megacom.Students.services;

import kg.megacom.Students.models.Dto.PaymentDto;
import kg.megacom.Students.models.Payment;

import java.util.List;

public interface PaymentService {

    PaymentDto createPayment(Payment payment);

    List<PaymentDto> findAll();

    Payment update(Long id, String paymentDate);

    void delete(Long id);
}
