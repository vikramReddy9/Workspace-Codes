package com.vikram.ManttoManyuni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {
@Id
@Column(name="S_NO")
@GenericGenerator(name="mygenerator",strategy="increment")
@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")
 private int sno;
@Column(name="S_NAME")
 private String sname;
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="student_course",joinColumns={
          @JoinColumn(name="s_sno",referencedColumnName="S_NO")},
inverseJoinColumns={
		  @JoinColumn(name="c_cno",referencedColumnName="C_NO") 	
})
private List<Course> clist;
}
