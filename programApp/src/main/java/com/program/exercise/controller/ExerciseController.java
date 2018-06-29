package com.program.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.program.exercise.form.Exercise;
import com.program.exercise.service.ExerciseServiceI;

@Controller
public class ExerciseController {

	public final static String GET_LIST = "/getListExercises.web";
	
	public final static String LIST_PAGE = "ListExercise";
	
	@Autowired
	private ExerciseServiceI exerciseService;
	
	@RequestMapping (value = GET_LIST, method = RequestMethod.GET)
	public String listExercise (Model model){
		
		List<Exercise> exerciseList = exerciseService.getExercises();
		
		model.addAttribute("exercises", exerciseList);
		
		return LIST_PAGE;
	}
}
