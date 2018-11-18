package com.project.ordermanager.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Status {

    private long status_id;
    private String value;
}
