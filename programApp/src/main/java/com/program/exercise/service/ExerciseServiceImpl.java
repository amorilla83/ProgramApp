package com.program.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.exercise.dao.ExerciseDAOI;
import com.program.exercise.form.Exercise;

@Service ("exerciseService")
public class ExerciseServiceImpl implements ExerciseServiceI {

	@Autowired
	private ExerciseDAOI exerciseDao;
	
	public List<Exercise> getExercises() {
		return exerciseDao.getAll();
	}

}
