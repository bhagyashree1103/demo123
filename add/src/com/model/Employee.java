package com.model;

public class Employee {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Employee [id=" + id + "]";
}

}
