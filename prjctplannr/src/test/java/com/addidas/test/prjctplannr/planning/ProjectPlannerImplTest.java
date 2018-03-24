package com.addidas.test.prjctplannr.planning;

import java.util.HashMap;

import com.addidas.test.prjctplannr.resources.Employee;
import com.addidas.test.prjctplannr.resources.Project;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ProjectPlannerImplTest extends TestCase {

	
	public void testAddEmployeeSuccess() throws Exception {
		Employee e= new Employee("CARL", "Java");
		ProjectPlannerImpl pp=new ProjectPlannerImpl();
		Assert.assertTrue(pp.addEmployee(e));
	}
	
	public void testAddEmployeeFail() throws Exception {
		Employee e= new Employee("CARL", "Java");
		ProjectPlannerImpl pp=new ProjectPlannerImpl();
		pp.addEmployee(e);
		Assert.assertFalse(pp.addEmployee(e));
	}
	
	public void testAddProjectSuccess() throws Exception {
		Project p= new Project("PIM",(new HashMap<String, Integer>()),1);
		ProjectPlannerImpl pp=new ProjectPlannerImpl();		
		Assert.assertTrue(pp.addProject(p));
	}
	public void testAddProjectFail() throws Exception {
		Project p= new Project("PIM",(new HashMap<String, Integer>()),1);
		ProjectPlannerImpl pp=new ProjectPlannerImpl();
		pp.addProject(p);
		Assert.assertFalse(pp.addProject(p));
	}
}
