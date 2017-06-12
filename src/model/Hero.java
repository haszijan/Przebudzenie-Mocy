package model;

import java.io.*;

public abstract class Hero implements Serializable {
	protected String name = "";
	protected String description;
	protected String skills = "Unknown";
	protected String professionSkill;

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getSkills() {
		return skills;
	}
}
