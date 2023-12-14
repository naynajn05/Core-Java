package com.tnsif.association.isademo;


//SubClass
public class Manager extends Employee{
private int teamSize;


//constructors
public Manager() {
	super();
}

public Manager(String name, int empId, String dept,int teamSize) {
	super(name, empId, dept);
	this.teamSize = teamSize;
}

public int getTeamSize() {
	return teamSize;
}

public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}

@Override
public String toString() {
	return "Manager [teamSize=" + teamSize + ", toString()=" + super.toString() + "]";
}






	
	
}
