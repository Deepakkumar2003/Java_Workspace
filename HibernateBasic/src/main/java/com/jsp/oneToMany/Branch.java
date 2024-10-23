package com.jsp.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	
private String name;
private String branchManager;
private String branchAdress;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranchManager() {
	return branchManager;
}
public void setBranchManager(String branchManager) {
	this.branchManager = branchManager;
}
public String getBranchAdress() {
	return branchAdress;
}
public void setBranchAdress(String branchAdress) {
	this.branchAdress = branchAdress;
}


}
