package model;

public class Assassin extends ProfessionDecorator {

	Hero hero;
	protected String professionSkills = "Sneak|Poisoned Blade|Hand to hand|";
	public Assassin(Hero hero) {
		this.hero = hero;
	}
	
	public String getSkills() {
		return hero.getSkills() + professionSkills;
	}

	public String getDescription() {
		return hero.getDescription() + "Assassin|";
	}

	public String getName() {
		return hero.getName();
	}

}
