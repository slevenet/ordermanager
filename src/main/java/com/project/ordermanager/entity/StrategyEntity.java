package com.project.ordermanager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "strategies")
public class StrategyEntity {

    @Id
    private long strategy_id;

    private String value;
}
