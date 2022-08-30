package kg.megacom.Students.controllers;

import kg.megacom.Students.models.Dto.PaymentDto;
import kg.megacom.Students.models.Payment;
import kg.megacom.Students.services.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payment")

public class PaymentController {

/*
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/createPayment")

    public PaymentDto createPayment(@RequestBody Payment payment){

        return paymentService.createPayment(payment);

    }

    @GetMapping("/findAll")
    public List<PaymentDto>findAll(){
        return paymentService.findAll();
    }

    @GetMapping("/update")
    public  Payment updatePayment(@RequestParam Long id, @RequestParam String paymentDate){
        return paymentService.update(id,paymentDate);
    }

    @DeleteMapping("/delete")
    void delete(@RequestParam Long id){ paymentService.delete(id);}
*/
}
