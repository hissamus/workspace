package com.addidas.test.prjctplannr.planning;

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
	@Override
	public boolean addEmployee(Employee employee) {
		return  employees.add(employee);		
	}

	@Override
	public boolean addProject(Project project) {
		return projects.add(project);
	}

	@Override
	public void plan() {
		
		for (Project p : projects){			
			p.setUpProject(this.employees);			
		}

	}
	
	

	@Override
	public void describeProectPlanner() {
		for (Project p : projects){			
			p.describeProject();
		}
	}
	
	@Override
	public void describeProjects(){
		for(Project p: this.projects)
			System.out.printf("%s "+p.toString()+"\n",new String(Character.toChars(0x00B0)));
		System.out.println();
	}
	
	
	@Override
	public void listEmployees(){
		for(Employee e: this.employees)
			System.out.printf("%s "+e.toString()+"\n",new String(Character.toChars(0x00B0)));
		System.out.println();
	}
	
	

}
