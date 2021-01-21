package com.vikram.ManttoManyuni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="course")
public class Course {
@Id
@Column(name="C_NO")
@GenericGenerator(name="mygenerator",strategy="increment")
@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")
	private int cno;
@Column(name="C_NAME")
	private String cname;
}
