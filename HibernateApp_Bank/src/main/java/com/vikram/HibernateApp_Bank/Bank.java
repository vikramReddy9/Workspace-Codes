package com.vikram.HibernateApp_Bank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedQueries;

import lombok.Data;
/*//@NamedQuery(name="Account.find.all",query="from Bank")
@javax.persistence.NamedQueries(
		{
			@NamedQuery(name="Account.find.all",query="from Bank"),
			@NamedQuery(name="Account.find.allById",query="from Bank b where b.accno=:accno"),
			@NamedQuery(name="Account.find.all",query="from Bank b where b.name:=name")		
		}		
		)*/
@Entity
@Table(name="Bank")
@Data
public class Bank {
@Id
@Column(name="ACCOUNT_NUMBER")
@GenericGenerator(name="mygenerator",strategy="increment")
@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")
private int accno;
@Column(name="ACCOUNT_NAME")
private String name;
@Column(name="ACCOUNT_BALANCE")
private double balance;

	}
