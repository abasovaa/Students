package kg.megacom.Students.services;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Payment;
import kg.megacom.Students.models.Student;

import java.util.List;

public interface PaymentService {
    List<Payment> setPayments(Student student, Group group);
}
