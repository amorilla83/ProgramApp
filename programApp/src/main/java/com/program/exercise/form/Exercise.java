package com.program.exercise.form;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Con entity y table estamos diciendo cómo se mapea la clase en la base de datos.
@Entity
@Table (name = "Exercise")
public class Exercise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8930861900736911093L;

	//Id indica a hibernate que es la primary key
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column(name="IdExercise")
	private int idExercise;
	
	@Column(name="Text", nullable = false, length = 3000)
	private String text;
	
	@Column(name="ConsoleResult", length = 3000)
	private String consoleResult;
	
	@Column(name="Code", length = 3000)
	private String code;

	public int getIdExercise() {
		return idExercise;
	}

	public void setIdExercise(int idExercise) {
		this.idExercise = idExercise;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getConsoleResult() {
		return consoleResult;
	}

	public void setConsoleResult(String consoleResult) {
		this.consoleResult = consoleResult;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Exercise [idExercise=" + idExercise + " \ntext=" + text + " \nconsoleResult=" + consoleResult + " \ncode="
				+ code + "]";
	}
}
