package com.project.ordermanager.repositories;

import com.project.ordermanager.entity.OrderEntity;

import java.util.List;

public interface OperationDB {

     <T> void insert(T entity);
     <T> void update(T entity);
     <T> void  delete(T entity);
     List selectAll();
     List select(String field, String value);
     <T> T select(long id);
}
