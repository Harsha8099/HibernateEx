package com.hibernate.pojo;

public class Employee {
private Integer id;
private String name;
private String password;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", password=" + password + "]";
}
public Employee(Integer id, String name, String password) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
}
public Employee() {
	// TODO Auto-generated constructor stub
}

}
