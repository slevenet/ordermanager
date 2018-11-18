package com.project.ordermanager.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "strategies")
public class Strategies {

    @Id
    private long stratigies_id;
    private String value;

    public Strategies() {
    }

    public Strategies(long stratigies_id, String value) {
        this.stratigies_id = stratigies_id;
        this.value = value;
    }

    public void setStratigies_id(long stratigies_id) {
        this.stratigies_id = stratigies_id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getStratigies_id() {
        return stratigies_id;
    }

    public String getValue() {
        return value;
    }
}
