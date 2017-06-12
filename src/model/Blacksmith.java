package model;

public class Blacksmith extends ProfessionDecorator {

	Hero hero;
	protected String professionSkills = "Armorer|";
	
	public Blacksmith(Hero hero) {
		this.hero = hero;
	}

	public String getSkills() {
		return hero.getSkills() + professionSkills;
	}

	public String getDescription() {
		return hero.getDescription() + "Blacksmith|";
	}

	public String getName() {
		return hero.getName();
	}

}
