package com.devsuperior.dependency_injection.services;

import com.devsuperior.dependency_injection.entities.Employee;

public class SalaryService {

   TaxService taxService = new TaxService();
   PensionService pensionService = new PensionService();

   public double netSalary(Employee employee) {
      return employee.getGrossSalary()
            - taxService.tax(employee.getGrossSalary())
            - pensionService.discount(employee.getGrossSalary());
   }
}