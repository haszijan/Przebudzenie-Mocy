package model;

import java.io.*;

public class TheForceAwakens {
	public static void main(String[] args) {
		
		Hero hero1 = new Human("Rumcajs");
		hero1 = new Warrior(hero1);
		hero1 = new Blacksmith(hero1);

		Hero hero2 = new Elf("Kulfon");
		hero2 = new Assassin(hero2);
		hero2 = new Mage(hero2);

		Hero hero3 = new Dwarf("Danny DeVito");
		hero3 = new Blacksmith(hero3);
		hero3 = new Warrior(hero3);
		
		Hero hero4 = new Rogue("Rasa £otrzyk FTW");
		hero4 = new Hunter(hero4);
		
		Hero hero5 = new Human("Cypisek");
		hero5 = new Mage(hero5);
		hero5 = new Warrior(hero5);
		
		showHero(hero1);
		showHero(hero2);
		showHero(hero3);
		showHero(hero4);
		showHero(hero5);
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("save.ser"));
			os.writeObject(hero1);
			os.writeObject(hero2);
			os.writeObject(hero3);
			os.writeObject(hero4);
			os.writeObject(hero5);
			os.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		hero1 = null;
		hero2 = null;
		hero3 = null;
		hero4 = null;
		hero5 = null;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("save.ser"));
			Hero p1N = (Hero) is.readObject();
			Hero p2N = (Hero) is.readObject();
			Hero p3N = (Hero) is.readObject();
			Hero p4N = (Hero) is.readObject();
			Hero p5N = (Hero) is.readObject();
			
			System.out.println("hero1: " + p1N.getName());
			System.out.println("hero1: " + p1N.getDescription());
			System.out.println("hero1: " + p1N.getSkills());
			System.out.println("hero2: " + p2N.getName());
			System.out.println("hero2: " + p2N.getDescription());
			System.out.println("hero2: " + p2N.getSkills());
			System.out.println("hero3: " + p3N.getName());
			System.out.println("hero3: " + p3N.getDescription());
			System.out.println("hero3: " + p3N.getSkills());
			System.out.println("hero4: " + p4N.getName());
			System.out.println("hero4: " + p4N.getDescription());
			System.out.println("hero4: " + p4N.getSkills());
			System.out.println("hero5: " + p5N.getName());
			System.out.println("hero5: " + p5N.getDescription());
			System.out.println("hero5: " + p5N.getSkills());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}		
	
	public static void showHero(Hero hero) {
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Name: " + hero.getName() + "\t|" + "Race and classes: " + hero.getDescription() + "\t|"
				+ "Skills: " + hero.getSkills());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
	}
}