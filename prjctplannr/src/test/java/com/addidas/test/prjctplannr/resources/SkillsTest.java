package com.addidas.test.prjctplannr.resources;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SkillsTest extends TestCase {

	public void testAddSkills_Success() throws Exception {
		Assert.assertTrue(Skills.addSkill("J2EE"));
	}

	public void testAddSkills_Fail() throws Exception {
		Skills.addSkill("Java2");
		Assert.assertFalse(Skills.addSkill("Java2"));
	}

	public void testGetSkillByName_Success() throws Exception {
		Assert.assertEquals(Skills.getSkill("ruby"), "Ruby");
	}
	
	public void testGetSkillByName_Fail() throws Exception {
		Assert.assertNotSame(Skills.getSkill("java"), "java");
	}
}
