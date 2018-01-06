package com.arcade.hibernate.model;

import java.io.Serializable;

public class Course implements Serializable{
	private Long idCourse;
	private String name;
	private String themes;
	private String project;
	private Teacher teacher;

	public Course(String name, String themes, String project, Teacher teacher) {
		super();
		this.name = name;
		this.themes = themes;
		this.project = project;
		this.teacher = teacher;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThemes() {
		return themes;
	}
	public void setThemes(String themes) {
		this.themes = themes;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
