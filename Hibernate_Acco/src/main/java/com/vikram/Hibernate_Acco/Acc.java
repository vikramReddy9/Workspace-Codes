package com.vikram.Hibernate_Acco;

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
@GenericGenerator(name="mygenerator",strategy="increment")
@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")
@Column(name="ACCOUNT_NUMBER")
private int accno;
@Column(name="ACCOUNT_NAME")
private String name;
@Column(name="ACCOUNT_BALANCE")
private double balance;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="CNO",referencedColumnName="Atm_Cno",unique=true)
private Atm atmcard;

	
	
	
}
