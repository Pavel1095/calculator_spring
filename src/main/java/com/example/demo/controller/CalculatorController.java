package com.example.demo.controller;

import com.example.demo.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не введены оба или одно значение для подсчета!";
        }
        int sum = calculatorService.sum(num1, num2);
        String result = String.format("%d + %d = %d", num1, num2, sum);
        System.out.println(result);
        return result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {

        if (num1 == null || num2 == null) {
            return "Не введены оба или одно значение для подсчета!";
        }

        long minus = calculatorService.substract(num1, num2);
        String result = String.format("%d - %d = %d", num1, num2, minus);
        System.out.println(result);
        return result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {

        if (num1 == null || num2 == null) {
            return "Не введены оба или одно значение для подсчета!";
        }

        int multiply = calculatorService.multiply(num1, num2);
        String result = String.format("%d * %d = %d", num1, num2, multiply);
        System.out.println(result);
        return result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {

        if (num1 == null || num2 == null) {
            return "Не введены оба или одно значение для подсчета!";
        } else if (num2 == 0) {
            return "нельзя делить на 0";
        }
        double divide = calculatorService.divide(num1, num2);
        String result = String.format("%d / %d = %f", num1, num2, divide);
        System.out.println(result);
        return result;
    }

}
