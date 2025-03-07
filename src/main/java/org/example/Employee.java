package org.example;

public class Employee {
    //instance variables:
    private int id;
    private String fullName;
    private String email;
    private String password;
    private  String[] healthPlans;

    //constructor:
    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    //getter methods:
    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void addHealthPlan(int index, String name) {

        if (index < 0 || index >= healthPlans.length) {
            System.out.println("invalid index");
            return;
        }
        if (healthPlans[index] == null) {
            healthPlans[index] = name;
        } else {
            System.out.println("index already occupied.");
        }
    }

    //toString method:
    @Override
    public String toString() {
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "'}";
    }
}
