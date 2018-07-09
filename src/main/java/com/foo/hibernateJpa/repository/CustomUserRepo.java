package com.foo.hibernateJpa.repository;

import com.foo.hibernateJpa.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomUserRepo {
    @Autowired
    private EntityManagerFactory factory;

    public List<User> getUser(String name){
        Session session = factory.unwrap(SessionFactory.class).getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<User> criteria = criteriaBuilder.createQuery(User.class);
        Root<User> root = criteria.from(User.class);
        criteria.where(criteriaBuilder.equal(root.get("name"), name));
        return session.createQuery(criteria).getResultList();
    }
}
