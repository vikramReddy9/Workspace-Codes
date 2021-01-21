package Hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="Acc")
public class Acc {
	@Id
	@Column(name="Account_Number")
	@GenericGenerator(name="myGenerator",strategy="increment")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")
	private int accno;
	@Column(name="Account_Name")
	private String name;
	@Column(name="Account_Balance")
	private double balance;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CNO",referencedColumnName="Atm_Cno",unique=true)
	private Atm atmcard;
	
}
