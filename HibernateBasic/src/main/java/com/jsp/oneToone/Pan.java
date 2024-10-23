package com.jsp.oneToone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
@Column(unique =true)
	private String panNumber;
@Column (nullable =false)
	private String Address;

@OneToOne(mappedBy ="pan")
private Person person;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPanNumber() {
	return panNumber;
}

public void setPanNumber(String panNumber) {
	this.panNumber = panNumber;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}


}