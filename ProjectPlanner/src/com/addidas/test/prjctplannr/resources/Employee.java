package com.addidas.test.prjctplannr.resources;

import java.util.Date;

public class Employee {

	private String employeeName;
	private String skill;
	private Project assignedProject;
	private Date startDate;
	private Date endDate;
	
	public Employee(String employeeName, String skill) {
		super();
		this.employeeName = employeeName;
		this.skill = Skills.getSkill(skill);
		Resources.getInstance().addResource(this , this.skill);
	}
	
	@Override
	public String toString() {	
		return employeeName+":"+skill;
	}
	
	public String getEmployeeName(){
		return this.employeeName;
	}
	
	public String getSkill(){
		return this.skill;
	}

	public Project getAssignedProject() {
		return assignedProject;
	}

	public void setAssignedProject(Project assignedProject) {
		this.assignedProject = assignedProject;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
