package com.vikram.HibernateApp_Account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="ACCOUNT")
/*@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString*/
@Data
public class Account {
	@Id
	@Column(name="ACCOUNT_NUMBER")
	/*@SequenceGenerator(name="mygenerator",sequenceName="stu_sno")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")*/
	//@GeneratedValue(strategy=GenerationType.IDENTITY,generator="mygenerator")
	/*@GenericGenerator(name="mygenerator",strategy="increment")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")*/
//	@GenericGenerator(name="mygenerator",strategy="Native",parameters={
//
//			
//	}
//			)
//	@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")
private int accno;
	@Column(name="ACCOUNT_NAME")
private String name;
	@Column(name="ACCOUNT_BALANCE")
private double balance;

}
