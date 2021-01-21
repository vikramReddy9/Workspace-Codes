package com.vikram.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="DEPT")
public class Department {
@Id
@GenericGenerator(name="mygenerator",strategy="increment")
@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")
@Column(name="DNO")
private int dno;
@Column(name="NAME")
private String dname;
@Column(name="LOCATION")
private String location;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="E_DNO",referencedColumnName="DNO",unique=true)
private Set<Employee> employeeset;
}
