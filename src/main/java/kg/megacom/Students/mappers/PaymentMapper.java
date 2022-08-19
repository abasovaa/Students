package kg.megacom.Students.mappers;

import kg.megacom.Students.Dto.PaymentDto;
import kg.megacom.Students.models.Payment;

import java.util.List;

public interface PaymentMapper {
    Payment fromDto(PaymentDto paymentDto);
    PaymentDto toDto(Payment payment);

    List<Payment> fromDtos(List<PaymentDto> paymentDto);
    List<PaymentDto> toDtos(List<Payment> payments);
}
