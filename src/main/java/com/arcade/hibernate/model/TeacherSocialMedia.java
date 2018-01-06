package com.arcade.hibernate.model;

import java.io.Serializable;

public class TeacherSocialMedia implements Serializable{

	private Long idTeacherSocialMedia;
	private Teacher teacher;
	private SocialMedia socialMedia;
	
	public TeacherSocialMedia(Teacher teacher, SocialMedia socialMedia) {
		super();
		this.teacher = teacher;
		this.socialMedia = socialMedia;
	}
	public TeacherSocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdTeacherSocialMedia() {
		return idTeacherSocialMedia;
	}
	public void setIdTeacherSocialMedia(Long idTeacherSocialMedia) {
		this.idTeacherSocialMedia = idTeacherSocialMedia;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public SocialMedia getSocialMedia() {
		return socialMedia;
	}
	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}
	
	
	
}
