import java.util.Scanner;
import java.util.ArrayList; 

public class RPS_Game {
	static ArrayList<String> arr = new ArrayList<>();
	
	static void storeArr(int winner) {
		if (winner == 1) {
			arr.add("Player win");
		}
		else if (winner == 0) {
			arr.add("Computer win");
		}
		else if (winner == 2) {
			arr.add("It was a tie");
		}
	}

	public static void main(String[] args) {
		String compChoice = "";
		RPS_Code rps = new RPS_Code();
		String choice = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the RPS Simulation");
		for (int i = 0; i < 10; i++) {
			System.out.println("Round " + (i + 1) + "!");
			System.out.println("What's your choice: rock, paper, or scissors?");
			choice = scan.nextLine();
			compChoice = rps.generateComp();
			System.out.println("You picked " + choice + ". The computer picked " + compChoice + ".");
			storeArr(rps.correctChoice(choice, compChoice));
			System.out.println("You have " + rps.getWins() + " win(s), and the computer has " + rps.getLosses() + " win(s). There has been " + rps.getTies() + " tie(s) so far.");
		}
		System.out.println("Here is the history of the games.");
		System.out.println(arr);

	}

}
