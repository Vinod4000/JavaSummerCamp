import java.util.Scanner;


public class Battle {
	int damageDealt;
	int pikachuBattle(String moveName) {
		if (moveName == "thunder") {
			int damageDealt = 110;
		}
		if (moveName == "quick attack") {
			int damageDealt = 60;
		}
		if (moveName == "headbutt") {
			int damageDealt = 70;
		}
		if (moveName == "tackle") {
			int damageDealt = 50;
		}
		return damageDealt;
	}
	int charizardBattle(String moveName) {
		if (moveName == "flamethrower") {
			int damageDealt = 90;
		}
		if (moveName == "aerial ace") {
			int damageDealt = 70;
		}
		if (moveName == "fire blast") {
			int damageDealt = 110;
		}
		if (moveName == "slash") {
			int damageDealt = 65;
		}
		return damageDealt;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		Pokemon Pikachu = new Pokemon("Pikachu", "electric", 250, "thunder", "quick attack", "headbutt", "tackle");
		Pokemon Charizard = new Pokemon("Charizard", "fire", 400, "flamethrower", "fly", "aerial ace", "slash");
		
		System.out.println("These are pikachu's moves: " + Pikachu.getMove1() + ", " + Pikachu.getMove2() + ", " + Pikachu.getMove3() + ", and " + Pikachu.getMove4());
		System.out.println("These are charizard's moves: " + Charizard.getMove1() + ", " + Charizard.getMove2() + ", " + Charizard.getMove3() + ", and " + Charizard.getMove4());
		
		while (Pikachu.getHP() > 0 || Charizard.getHP() > 0) {
			System.out.println("Which move do you want Pikachu to use?");
			String movePika = input.nextLine();
			System.out.println(movePika);
			System.out.println(Pikachu.getMove1());
			System.out.println(movePika.equals(Pikachu.getMove1()));
			while (movePika.equals(Pikachu.getMove1()) == false || movePika.equals(Pikachu.getMove2()) == false || movePika.equals(Pikachu.getMove3()) == false || movePika.equals(Pikachu.getMove4()) == false) {
				System.out.println("That isn't one of Pikachu's moves.");
				System.out.println("Which move do you want Pikachu to use?");
				movePika = input.nextLine();
			}
				
			System.out.println("Which move do you want Charizard to use?");
			String moveChar = input.nextLine();
			System.out.println("Pikachu used " + movePika);
			System.out.println("Charizard used " + moveChar);
			break;
		}
		
		
	}
	
	
}
