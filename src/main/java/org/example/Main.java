package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Healthplan basicPlan = new Healthplan(1, "Basic Health Plan", Plan.BASIC);
        Employee employee = new Employee(100,  "Hande Dan", "hande.dann@gmail.com", "1234", new String[2]);
        Company company = new Company(200, "Microsoft", 100000, new String[200]);

        employee.addHealthPlan(0, basicPlan.getName());
        company.addEmployee(0, employee.getFullName());

        System.out.println(basicPlan);
        System.out.println(employee);
        System.out.println(company);
    }
}