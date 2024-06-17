package com.devsuperior.dependency_injection.services;

import com.devsuperior.dependency_injection.entities.Employee;

public class SalaryService {
   TaxService taxService;
   PensionService pensionService;

   public SalaryService() {
   }

   public SalaryService(TaxService taxService, PensionService pensionService) {
      this.taxService = taxService;
      this.pensionService = pensionService;
   }

   public double netSalary(Employee employee) {
      return employee.getGrossSalary()
            - taxService.tax(employee.getGrossSalary())
            - pensionService.discount(employee.getGrossSalary());
   }
}