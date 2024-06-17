package com.devsuperior.dependency_injection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dependency_injection.entities.Employee;

@Service
public class SalaryService {
   @Autowired
   TaxService taxService;
   @Autowired
   PensionService pensionService;

   public double netSalary(Employee employee) {
      return employee.getGrossSalary()
            - taxService.tax(employee.getGrossSalary())
            - pensionService.discount(employee.getGrossSalary());
   }
}