package com.addidas.test.prjctplannr.resources;

import java.util.HashSet;
import java.util.Set;

public class Skills {
	
	private static Set<String> skillSet =new HashSet<String>();
	
	public Skills() {
		super();		
	}

	public static boolean addSkill(String skillName){
	
		if(skillSet.contains(skillName.toUpperCase()))
			return false;
		
		skillSet.add(skillName.toUpperCase());
		
		return true;
	}
	
	public static String getSkill(String skillName){
		if(!skillSet.contains(skillName.toUpperCase()))
			addSkill(skillName);
		
		return skillName.substring(0, 1).toUpperCase()+skillName.substring(1,skillName.length()).toLowerCase(); 
		
	}

}
