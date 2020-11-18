package aaron.hales.ch9;

public class Loosing_Battle {

	public Loosing_Battle() {
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Their decaying green bodies stretch out, melting into the horizon.");
		System.out.println("Your hero unsheathes his sword for the last fight of his life.\n");
		
		int hero_health = 100;
		int dead_trolls = 0;
		int troll_damage = 7;
		int hero_damage = 10;
		int troll_health = 10;

		while (hero_health >= 0) {
			int hero_attack = hero_damage;
			int troll_attack = troll_damage;
			hero_health -= troll_attack;
			if(hero_attack >= troll_health) {
				dead_trolls += 1;
				System.out.println("Your hero swings and defeats an evil troll.");
				System.out.println("But your hero takes " + troll_attack + " damage points.\n");
				System.out.println("Your hero has " + hero_health + " health left.");
				System.out.println("Your hero has killed a total of " + dead_trolls + " trolls.\n\n");
			}
		}
		System.out.println("Your hero has killed " + dead_trolls + " trolls.");
		System.out.println("However, your hero has died.");
	}

	public static void main(String[] args) {
		new Loosing_Battle();

	}

}
