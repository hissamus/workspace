package com.addidas.test.prjctplannr.planning;
/**
 * @User Hissam
 * ProjectPlannerImpl implements IProjectPlanner
 * Its the DAO to implement the Planner services
 * 
 */
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.addidas.test.prjctplannr.resources.Employee;
import com.addidas.test.prjctplannr.resources.Project;

public class ProjectPlannerImpl implements IProjectPlanner {

	private Set<Employee> employees;
	private Set<Project> projects;
	
	public ProjectPlannerImpl(){
		employees=new HashSet<Employee>();
		projects=new HashSet<Project>();
	}
	
	/*
	 * As when required we can Add new Employees
	 * */
	@Override
	public boolean addEmployee(Employee employee) {
		return  employees.add(employee);		
	}

	/*
	 * As when required we can Add new Projects
	 * Maintains a list of All Projects that could be in Pipeline 
	 * without any plan for any execution
	 * */
	@Override
	public boolean addProject(Project project) {
		return projects.add(project);
	}
	
	/*
	 * This method plans/setup the projects randomly by assigning the avalaible 
	 * employees with respective skillset
	 * */
	@Override
	public void plan() {
		
		for (Project p : projects){			
			p.setUpProject(this.employees);			
		}

	}
	
	/*
	 * Describes all Projects plan info
	 * */

	@Override
	public void describeProectPlanner() {
		for (Project p : projects){			
			p.describeProject();
		}
	}
	/*
	 * Describes all Projects info
	 * */
	@Override
	public void describeProjects(){
		for(Project p: this.projects)
			System.out.printf("%s "+p.toString()+"\n",new String(Character.toChars(0x00B0)));
		System.out.println();
	}
	
	/*
	 * Listing all the employeess with respective skillset
	 * */
	@Override
	public void listEmployees(){
		for(Employee e: this.employees)
			System.out.printf("%s "+e.toString()+"\n",new String(Character.toChars(0x00B0)));
		System.out.println();
	}
	
	

}
