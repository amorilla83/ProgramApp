package com.program.exercise.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.program.exercise.form.Exercise;

//Repository indica a Spring que es un beans y que forma parte del modelo.
@Repository ("ExerciseDao")
public class ExerciseDAOImpl implements ExerciseDAOI {

	@Autowired
	private SessionFactory sessionFactory;
	
	//Transaccional indica que la transacción o se completa entera o se hace rollback
	//En los select no es necesario, pero ya que se delega Hibernate a Spring hace falta.
	@Transactional
	public List<Exercise> getAll() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Exercise> exercises = session.createQuery("from Exercise").list();
		return exercises;
	}

}
