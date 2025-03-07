package org.example;

public class Company {
    //instance variables:
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    //constructor:
    public Company(int id, String  name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if(giro < 0) {
            this.giro = 0;
        }
        this.giro = giro;
        this.developerNames = developerNames;
    }

    //getter methods:
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getGiro() {
        return giro;
    }
    public String[] getDeveloperNames() {
        return developerNames;
    }

    //method:
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("invalid index");
            return;
        }
        if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("index already occupied.");
        }
    }

    //toString method:
    @Override
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + "}";
    }
}
