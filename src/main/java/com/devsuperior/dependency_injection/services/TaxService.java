package com.devsuperior.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
   public double tax(double amount) {
      return amount * 0.2;
   }
}