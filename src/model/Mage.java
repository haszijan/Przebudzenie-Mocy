package model;

public class Mage extends ProfessionDecorator {

	Hero hero;
	protected String professionSkills = "Casting spells|Alchemy|";
	
	public Mage(Hero hero) {
		this.hero = hero;
	}
	
	public String getSkills() {
		return hero.getSkills() + professionSkills;
	}

	@Override
	public String getDescription() {
		return hero.getDescription() + "Mage|";
	}

	public String getName() {
		return hero.getName();
	}

}
