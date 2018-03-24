package com.addidas.test.prjctplannr.resources;
/*
 * @author Hissam
 * Describes Project Detail 
 * Evaluates Project feasibility with respective avalaible
 * resources with start and end date   
 * */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Project {

	private String projectName;
	private Set<Employee> team;
	private int duration;
	private Date startDate = null;
	private Date endDate = null;
	private Map<String, Integer> teamRequirements;
	private boolean feasible = false;
	private String message = "";

	public Project(String projectName, Map<String, Integer> teamRequirement, int duration) {
		super();
		this.projectName = projectName;
		this.teamRequirements = teamRequirement;
		this.duration = duration;
	}

	public Project setUpProject(Set<Employee> resources) {
		setUpDates();//setting the required END and STARt date
		Set<Employee> gatherTeam = new HashSet<Employee>();
		int totalResourcesRequired = 0;
		this.feasible = true;
		this.message="";
		for (String skill : teamRequirements.keySet()) {
			List<Employee> skilledEmployees = Resources.getInstance().getResourceListBySkillName(skill);
			if (skilledEmployees != null) {
				int requiredSkilledResources = teamRequirements.get(skill);
				totalResourcesRequired += requiredSkilledResources;
				int currentSkilledResourceCount = 0;
				for (Employee e : skilledEmployees) {

					if (isEmployeeAvailable(e)) {
						gatherTeam.add(e);
						currentSkilledResourceCount++;
						if (requiredSkilledResources == currentSkilledResourceCount)
							break;
					}
				}
				if (currentSkilledResourceCount != requiredSkilledResources) {
					feasible = false;
					if (message == "")
						message = "no Skills";
					break;
				}
			} else {
				feasible = false;
				if (message == "")
					message = "no Skills";
				break;
			}

		}
		
		// Adding exactly 1 QA and 1 OPS resources for the project
		if (feasible == true && totalResourcesRequired == gatherTeam.size()) {
			boolean qaAdded = false;
			boolean opsAdded = false;
			List<Employee> skilledEmployees = Resources.getInstance().getResourceListBySkillName("Qa");
			if (skilledEmployees != null) {

				for (Employee e : skilledEmployees) {
					if (e.getAssignedProject() == null && qaAdded==false) {
						gatherTeam.add(e);
						qaAdded = true;
						break;
					}
				}
			}
			skilledEmployees = Resources.getInstance().getResourceListBySkillName("Ops");
			if (skilledEmployees != null) {
				for (Employee e : skilledEmployees) {
					if (e.getAssignedProject() == null && opsAdded==false) {
						gatherTeam.add(e);
						opsAdded = true;
						break;
					}
				}
			}
			//The team is ready with the required resources
			//setting each employee engagements START/END Dates to refernce for other projects
			if (opsAdded && qaAdded) {
				for (Employee e : gatherTeam) {
					e.setAssignedProject(this);
					e.setStartDate(this.startDate);
					e.setEndDate(this.endDate);
				}
				
				this.setTeam(gatherTeam);

			}
			else{
				this.feasible=false;
				if (message != "")
					message = "no Skills";
			}
		}
		return this;
	}

	/*
	 * Grab the employee if no project is assinged
	 * ELSE
	 * evaluate its release time and engage the resources for the project
	 * */
	private boolean isEmployeeAvailable(Employee e) {

		if (e.getAssignedProject() == null)
			return true;
		else {
			Date s = e.getEndDate();
			Calendar c = Calendar.getInstance();
			c.setTime(s);
			c.add(Calendar.WEEK_OF_YEAR, this.duration);
			if (c.get(Calendar.WEEK_OF_YEAR) > 48) {// As per requirement
				feasible = false;
				message = "no Time";
				return false;
			} else {
				return true;
			}
		}
		// return false;
	}

	private void setUpDates() {
		Calendar calendarStart = Calendar.getInstance();
		calendarStart.set(Calendar.MONTH, 0);
		calendarStart.set(Calendar.DAY_OF_MONTH, 1);
		
		Date startDate = calendarStart.getTime();		

		Calendar calendarEnd = Calendar.getInstance();
		calendarEnd.set(Calendar.WEEK_OF_YEAR, duration);
		
		Date endDate = calendarEnd.getTime();

		this.startDate = startDate;
		this.endDate = endDate;
	}

	
	public void describeProject() {
		if (this.feasible) {
			System.out.println(this.projectName);

			Calendar start = Calendar.getInstance();
			start.setTime(startDate);
			int weekStart = start.get(Calendar.WEEK_OF_MONTH);
			System.out.println("\tstart: " + getWeekSuffix(weekStart) + " week of " + getMonthSuffix(startDate));

			Calendar end = Calendar.getInstance();
			end.setTime(endDate);
			int weekEnd = end.get(Calendar.WEEK_OF_MONTH);
			System.out.println("\tend: " + getWeekSuffix(weekEnd) + " week of " + getMonthSuffix(endDate));

			String res = "";
			boolean b = true;
			for (Employee e : this.getTeam()) {
				if (!b) {
					res += ", ";
				}
				res += e.getEmployeeName();
				b = false;
			}
			System.out.println("\tteam: " + res);
		} else {
			
			System.out.println(this.projectName);
			System.out.println("\tnot feasible: " + this.message);
		}
	}

	private String getWeekSuffix(final int n) {

		switch (n) {
		case 1:
			return "1st";
		case 2:
			return "2nd";
		case 3:
			return "3rd";
		default:
			return "4th";
		}
	}

	private String getMonthSuffix(final Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM");
		return sdf.format(date);
	}

	@Override
	public String toString() {

		Map<String, Integer> employeeMap = new HashMap<String, Integer>();
		for (String skill : getTeamRequirements().keySet()) {

			employeeMap.put(skill, getTeamRequirements().get(skill));

		}

		String res = "";
		boolean b = true;
		for (String skill : employeeMap.keySet()) {
			if (!b) {
				res += ", ";
			}
			res += employeeMap.get(skill) + "x" + skill;
			b = false;
		}

		return projectName + "(" + res + ")" + " - " + duration + " weeks";
	}

	public Set<Employee> getTeam() {
		return team;
	}

	public void setTeam(Set<Employee> team) {
		this.team = team;
	}

	public Map<String, Integer> getTeamRequirements() {
		return Collections.unmodifiableMap(teamRequirements);
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
