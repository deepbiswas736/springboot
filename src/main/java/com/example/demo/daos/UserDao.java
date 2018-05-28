package com.example.demo.daos;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.User;

@Repository
@Transactional
public class UserDao {
	
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	}

	public User getById(long id) {
	    return (User) getSession().load(User.class, id);
	 
	}
	public void save(User user) {
	    getSession().save(user);
	  }
	  
	  public void delete(User user) {
	    getSession().delete(user);
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List getAll() {
	    return getSession().createQuery("from User_table").list();
	  }
	  
	  public void update(User user) {
		    getSession().update(user);
	  }
	
}
