package model;

public class Warrior extends ProfessionDecorator {

	Hero hero;
	protected String professionSkills = "Hand-to-hand|Long Blade|Axe|Spear|";
	
	public Warrior(Hero hero) {
		this.hero = hero;
	}
	
	public String getSkills() {
		return hero.getSkills() + professionSkills;
	}

	public String getDescription() {
		return hero.getDescription() + "Warrior|";
	}

	public String getName() {
		return hero.getName();
	}
}
