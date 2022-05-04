package com;

import java.util.Vector;

public class TestEmployeeCollection {
public static void main(String[] args) {
	Vector<Employee> v = addInput();
	display(v);
}

private static Vector<Employee> addInput() {
	// TODO Auto-generated method stub
	Employee e1 = new Employee(101,"Raju","Kolkata") ;
	Employee e2 = new Employee(102,"Puja","Mumbai") ;
	Employee e3 = new Employee(103,"Sahil","Delhi") ;
	Vector<Employee> v = new Vector<Employee>();
	v .add(e1);
	v.add(e2);
	v.add(e3);
	return v;
}

private static void display(Vector<Employee> v) {
	// TODO Auto-generated method stub
	for(Employee e:v)
	{
		System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
	}
}
}