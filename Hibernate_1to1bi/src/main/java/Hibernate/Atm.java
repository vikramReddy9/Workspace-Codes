package Hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="ATM")
public class Atm {
	@Id
	@Column(name="ATM_NO")
	@GenericGenerator(name="mygenerator",strategy="increment")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mygenerator")
	private int Cno;
	@Column(name="ATM_PASSWORD")
	private String cardpswrd;
	@Column(name="ATM_TYPE")
	private String cardtype;
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Acc account;
}
