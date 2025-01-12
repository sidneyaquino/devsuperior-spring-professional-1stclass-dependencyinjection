package com.devsuperior.dependency_injection;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.dependency_injection.entities.Employee;
import com.devsuperior.dependency_injection.services.SalaryService;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {
	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salario bruto: ");
		double grossSalary = sc.nextDouble();
		Employee employee = new Employee(name, grossSalary);

		double netSalary = salaryService.netSalary(employee);
		System.out.printf("Salario liquido = %.2f%n", netSalary);

		sc.close();
	}
}