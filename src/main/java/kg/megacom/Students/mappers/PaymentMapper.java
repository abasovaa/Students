package kg.megacom.Students.mappers;

import kg.megacom.Students.models.Dto.PaymentDto;
import kg.megacom.Students.models.Payment;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PaymentMapper {

    private final ModelMapper modelMapper;

    private Payment toEntity(PaymentDto paymentDto){
        return Objects.isNull(paymentDto)?null :modelMapper.map(paymentDto, Payment.class);
    }

    public PaymentDto toDto(Payment payment){
        return Objects.isNull(payment)?null :modelMapper.map(payment, PaymentDto.class);
    }

    public List<PaymentDto> toDtoList(List<Payment> paymentList) {
        return paymentList.stream().map(payment -> modelMapper.map(payment, PaymentDto.class)).collect(Collectors.toList());

    }
}
