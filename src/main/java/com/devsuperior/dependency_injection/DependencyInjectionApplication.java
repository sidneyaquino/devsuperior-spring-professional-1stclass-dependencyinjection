package com.devsuperior.dependency_injection;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner{

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
   	double netSalary = grossSalary * 0.7; 
		System.out.printf("Salario liquido = %.2f%n", netSalary);

		sc.close();
	}
}