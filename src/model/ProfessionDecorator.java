package model;

import java.io.*;

public abstract class ProfessionDecorator extends Hero implements Serializable {
	
	public abstract String getDescription();
	public abstract String getSkills();
	public abstract String getName();
}
