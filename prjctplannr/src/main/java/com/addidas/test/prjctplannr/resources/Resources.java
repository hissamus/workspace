package com.addidas.test.prjctplannr.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Resources {
	
	private static Resources _instance;
	private static Object lock=new Object();
	
	private Map<String, List<Employee>> employeeToSkillMap;
	
	private Resources() {
		employeeToSkillMap=new HashMap<String, List<Employee>>();
	}
	
	public  static Resources getInstance(){
		if(_instance!=null)
			return _instance;
		
		synchronized (lock) {
			if(_instance==null){
				_instance=new Resources();
			}
		}		
		return _instance;
	}
	
	public void addResource(Employee employee, String skillName){
		if(employeeToSkillMap.get(Skills.getSkill(skillName))==null){
			List<Employee> skilledEmployee=new ArrayList<Employee>();
			skilledEmployee.add(employee);
			employeeToSkillMap.put(Skills.getSkill(skillName), skilledEmployee);
		}
		else{
			List<Employee> skilledEmployee=employeeToSkillMap.get(Skills.getSkill(skillName));
			skilledEmployee.add(employee);
		}
	}
	
	public List<Employee> getResourceListBySkillName(String skillName){
		return employeeToSkillMap.get(Skills.getSkill(skillName));
	}
}
