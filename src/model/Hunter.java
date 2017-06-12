package model;

public class Hunter extends ProfessionDecorator {

	Hero hero;
	protected String professionSkills = "Sneak|Marksman|";
	
	public Hunter(Hero hero) {
		this.hero = hero;
	}
	
	public String getSkills() {
		return hero.getSkills() + professionSkills;
	}

	public String getDescription() {
		return hero.getDescription() + "Hunter|";
	}

	public String getName() {
		return hero.getName();
	}

}
