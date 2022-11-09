package ua.edu.ucu.apps.l4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/payment_by_cc")
public class CreditCardController {
    @GetMapping
    public String payment_by_()
    {
        return "Credit Card";
    }
}