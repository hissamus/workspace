package com.addidas.test.prjctplannr.planning;

import com.addidas.test.prjctplannr.resources.Employee;
import com.addidas.test.prjctplannr.resources.Project;

public interface IProjectPlanner {

	boolean addEmployee(Employee employee);
	boolean addProject(Project project);
	void plan();
	void describeProectPlanner();
	void describeProjects();
	void listEmployees();
}
