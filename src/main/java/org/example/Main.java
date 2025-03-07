package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        //sample 1st:
        Healthplan basicPlan = new Healthplan(1, "Basic Health Plan", Plan.BASIC);
        Employee employee1 = new Employee(100,  "Hande Dan", "hande.dann@gmail.com", "1234", new String[2]);
        Company company1 = new Company(200, "Microsoft", 100000, new String[200]);

        employee1.addHealthPlan(0, basicPlan.getName());
        company1.addEmployee(0, employee1.getFullName());

        System.out.println(basicPlan);
        System.out.println(employee1);
        System.out.println(company1);

        //sample 2nd:
        Healthplan premiumPlan = new Healthplan(2, "Premium Health Plan", Plan.PREMIUM);
        Employee employee2 = new Employee(200,  "Hakan Kuru", "hande.dann@gmail.com", "1234", new String[2]);
        Company company2 = new Company(400, "Google", 100000, new String[200]);

        employee2.addHealthPlan(0, premiumPlan.getName());
        company2.addEmployee(0, employee2.getFullName());

        System.out.println(premiumPlan);
        System.out.println(employee2);
        System.out.println(company2);

        //sample 3rd:
        Healthplan vipPlan = new Healthplan(3, "VIP Health Plan", Plan.VIP);
        Employee employee3 = new Employee(300,  "Nil Kuru", "hande.dann@gmail.com", "1234", new String[2]);
        Company company3 = new Company(500, "Amazon", 100000, new String[200]);

        employee3.addHealthPlan(0, vipPlan.getName());
        company3.addEmployee(0, employee3.getFullName());

        System.out.println(vipPlan);
        System.out.println(employee3);
        System.out.println(company3);
    }
}