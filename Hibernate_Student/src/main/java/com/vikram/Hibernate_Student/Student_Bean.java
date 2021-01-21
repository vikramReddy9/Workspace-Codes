package com.vikram.Hibernate_Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Student")
@Data
public class Student_Bean {
@Id
@Column(name="Serialno")
@GenericGenerator(name="mygenerator",strategy="increment")
@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")
private int sno;
@Column(name="Name")
private String sname;
@Column(name="Adress")
private String sadd;

}
