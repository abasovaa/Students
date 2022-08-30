package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Lesson;
import kg.megacom.Students.models.Payment;
import kg.megacom.Students.models.Student;
import kg.megacom.Students.models.enums.PaymentStatusEnum;
import kg.megacom.Students.repositories.PaymentRepo;
import kg.megacom.Students.services.LessonService;
import kg.megacom.Students.services.PaymentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepo paymentRepo;

    private final LessonService lessonService;

    public PaymentServiceImpl(PaymentRepo paymentRepo, LessonService lessonService) {
        this.paymentRepo = paymentRepo;
        this.lessonService = lessonService;
    }

    @Override
    public List<Payment> setPayments(Student student, Group group) {
        List<Lesson> lessons = lessonService.findLessonByGroup(group);
        List<Payment> payments = new ArrayList<>();

        for (int i = 0; i < lessons.size(); i++) {
            if (i % group.getCourse().getPeriod() == 0) {
                Payment payment = new Payment();
                payment.setStudent(student);
                payment.setGroup(group);
                payment.setPaymentDate(lessons.get(i).getDay());
                payment.setStatus(PaymentStatusEnum.UNPAID);

                payments.add(payment);
            }
        }
        payments = paymentRepo.saveAll(payments);
        return payments;
    }
}
