package com.java.spring;

import java.util.List;

public interface EmpDao {
	public void insert(Employee e);
	public void update(Employee e);
	public void delete(Employee e);
	public List<Employee> fetch();
	
}
