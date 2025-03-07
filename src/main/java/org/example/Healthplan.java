package org.example;

import org.example.enums.Plan;

public class Healthplan {
    //instance variables:
    private int id;
    private String name;
    private Plan plan;

    //constructor:
    public  Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    //getter methods:
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Plan getPlan() {
        return plan;
    }

    //setter methods:
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    //toString method:
    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan='" + plan + '\'' +
                '}';
    }
}
