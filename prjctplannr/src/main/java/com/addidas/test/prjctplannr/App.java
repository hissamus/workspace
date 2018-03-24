package com.addidas.test.prjctplannr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.addidas.test.prjctplannr.planning.IProjectPlanner;
import com.addidas.test.prjctplannr.planning.ProjectPlannerImpl;
import com.addidas.test.prjctplannr.resources.Employee;
import com.addidas.test.prjctplannr.resources.Project;

/**
 * Hello world!
 *
 */
public class App 
{
	IProjectPlanner planner;
	public static void main(String[] args) {
		App main=new App();		
	}
	
	public  App(){		
		initialize();
		System.out.println("Please Enter any of the following commands\n1.PEOPLE\n2.PROJECTS\n3.QUIT\n");
		Scanner scan =new Scanner(System.in);
		while(true){//Waiting for user input
			String cmd=scan.nextLine();
			if(cmd.equals("PEOPLE")){// listing employess
				System.out.println("PEOPLE");
				planner.listEmployees();
				System.out.println();
			}
			
			else if(cmd.equals("PROJECTS")){//llisting projects and project info
				System.out.println("PROJECTS");
				planner.describeProjects();
				System.out.println();				
				planner.describeProectPlanner();
			}
			else if(cmd.equals("QUIT")){
				break;
			}
			else{
				System.out.println("Invalid CMD");
			}
			
		}
	}
	
	// We initialize the data 
	private void initialize(){
		planner=new ProjectPlannerImpl();
		addEmployees();
		addProjects();
		planner.plan();
	}
	private void addEmployees(){
		
		Employee carl=new Employee("Carl", "Java");
		Employee Lenny=new Employee("Lenny","Java");
		Employee Bart=new Employee("Bart","JavaScript");
		Employee Moe=new Employee("Moe","JavaScript");
		Employee Milhouse=new Employee("Milhouse",".net");
		Employee Lisa=new Employee("Lisa",".net");
		Employee Ned=new Employee("Ned","QA");
		Employee Edna=new Employee("Edna","QA");
		Employee Barney=new Employee("Barney","Ops");
		Employee Homer =new Employee("Homer","Ops");
		
		planner.addEmployee(carl);
		planner.addEmployee(Lenny);
		planner.addEmployee(Bart);
		planner.addEmployee(Moe);
		planner.addEmployee(Milhouse);
		planner.addEmployee(Lisa);
		planner.addEmployee(Ned);
		planner.addEmployee(Edna);
		planner.addEmployee(Barney);
		planner.addEmployee(Homer);
		
	}
	
	private void addProjects(){
		Map<String,Integer> PIMTeamRequirement=new HashMap<String, Integer>();
		PIMTeamRequirement.put(".net", 2);
		PIMTeamRequirement.put("JavaScript", 1);		
		Project PIM=new Project("PIM", PIMTeamRequirement, 10);
		planner.addProject(PIM);
		Map<String,Integer> DAMTeamRequirement=new HashMap<String, Integer>();
		DAMTeamRequirement.put("Java", 2);
		DAMTeamRequirement.put("JavaScript", 1);	
		Project DAM=new Project("DAM", DAMTeamRequirement, 8);
		planner.addProject(DAM);
		
		Map<String,Integer> ABCTeamRequirement=new HashMap<String, Integer>();
		ABCTeamRequirement.put("Java", 2);
		ABCTeamRequirement.put("JavaScript", 1);
		Project ABC=new Project("ABC", ABCTeamRequirement, 41);
		planner.addProject(ABC);
		
		Map<String,Integer> XYZTeamRequirement=new HashMap<String, Integer>();
		XYZTeamRequirement.put("Ruby", 1);
		Project XYZ=new Project("XYZ", XYZTeamRequirement, 3);
		planner.addProject(XYZ);
	}
	
	

}

	