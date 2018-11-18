package com.project.ordermanager.repositories;

import com.project.ordermanager.entity.OrderEntity;
import com.project.ordermanager.model.Order;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class OrderRepository  implements OperationDB{

    @Autowired
    private SessionFactory sessionFactory;

    public void save(){
       // sessionFactory.getCurrentSession().save();
    }

    @Override
    public <T> void insert(T entity) {
        sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public <T> void update(T entity) {
        sessionFactory.getCurrentSession().update(entity);
    }

    @Override
    public <T> void delete(T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }

    @Override
    public List<OrderEntity> selectAll() {
        CriteriaQuery<OrderEntity> query = sessionFactory.getCurrentSession().getCriteriaBuilder().createQuery(OrderEntity.class);
        Root<OrderEntity> root = query.from(OrderEntity.class);
        query.select(root);
        return sessionFactory.getCurrentSession().createQuery(query).getResultList();
    }

    @Override
    public OrderEntity select(long id) {
        return sessionFactory.getCurrentSession().get(OrderEntity.class,id);
    }
}
