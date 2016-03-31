package com.example.many2many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_detail")
public class Course {

	int id;
	String title;
	short duration; // hrs

	public Course() {
	}

	public Course(String title, short duration) {
		this.title = title;
		this.duration = duration;
	}

	public Course(int id, String title, short duration) {
		this.id = id;
		this.title = title;
		this.duration = duration;
	}

	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(length = 20)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public short getDuration() {
		return duration;
	}

	public void setDuration(short duration) {
		this.duration = duration;
	}

}
