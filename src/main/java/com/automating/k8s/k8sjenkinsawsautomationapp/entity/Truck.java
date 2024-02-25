package com.automating.k8s.k8sjenkinsawsautomationapp.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Truck {
    @Id
    @SequenceGenerator(
            name="truck_sequence",
            sequenceName = "truck_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "truck_sequence"
    )
    private Long id;
    private String model;

    public Truck() {
    }

    public Truck(String model) {
        this.model = model;
    }

    public Truck(long id, String model) {
        this.id = id;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
