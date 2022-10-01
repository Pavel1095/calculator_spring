package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int sum(int v1, int v2) {
        return v1 + v2;
    }

    public long substract(long v1, long v2) {
        return v1 - v2;
    }

    public int multiply(int v1, int v2) {
        return v1 * v2;
    }

    public double divide(double v1, double v2) {
        return v1 / v2;
    }
}
