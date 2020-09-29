package com.nj;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@Column(name="id",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	 int id;
	@Column(name="esalary")
	int sal;
	public String name;
	public Employee()
	{
	super();
	}
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
	
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
}
	
	
