package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Dto.PaymentDto;
import kg.megacom.Students.mappers.PaymentMapper;
import kg.megacom.Students.models.Payment;
import kg.megacom.Students.repositories.PaymentRepo;
import kg.megacom.Students.services.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepo paymentRepo;

    private final PaymentMapper paymentMapper;

    public PaymentServiceImpl(PaymentRepo paymentRepo, PaymentMapper paymentMapper) {
        this.paymentRepo = paymentRepo;
        this.paymentMapper = paymentMapper;
    }

    @Override
    public PaymentDto createPayment(Payment payment) {
      /*  Payment newPayment=new Payment();
        newPayment.setId(payment.getId());
        newPayment.setPaymentDate(payment.getPaymentDate());
        newPayment.setGroup(newPayment.getGroup());
        newPayment.setStudent(newPayment.getStudent());
        newPayment.setStatus(newPayment.getStatus());*/

        paymentRepo.save(payment);

        return paymentMapper.toDto(payment);
    }

    @Override
    public List<PaymentDto> findAll() {

        List<Payment> paymentList=paymentRepo.findAll();

        return paymentMapper.toDtoList(paymentList);
    }

    @Override
    public Payment update(Long id, String paymentDate){
    Optional<Payment> payment=Optional.of(paymentRepo.findById(id).get());

    paymentRepo.update(id,paymentDate);
    return null;
    }

    @Override
    public void delete(Long id) {

        paymentRepo.delete(paymentRepo.findById(id).get());

    }
}
