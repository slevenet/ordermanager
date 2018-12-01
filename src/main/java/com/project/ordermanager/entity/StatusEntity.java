package com.project.ordermanager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "status")
public class StatusEntity {

    @Id
    private long status_id;
    private String value;
}
