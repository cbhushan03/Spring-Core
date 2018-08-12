package com.cbt.tutorials.dao;

import java.util.List;

import com.cbt.tutorials.model.Person;

public interface PersonDAO {
	public void save(Person p);
	
	public List<Person> list();
}
