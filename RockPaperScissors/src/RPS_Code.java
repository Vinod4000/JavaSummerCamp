
public class RPS_Code {
	public int wins;
	public int losses;
	public int ties;
	public String choice;
	
	RPS_Code() {
		wins = 0;
		losses = 0;
		ties = 0;
		choice = "";

	}
	
	RPS_Code (String choice) {
		this.choice = choice;
	}
	
	void correctChoice(String cho, String comp) {
		if (cho == "rock" && comp == "paper" || cho == "paper" && comp == "rock" || cho == "scissors" && comp == "paper") {
			wins += 1;
		}
		if (cho.equals(comp)) {
			ties += 1;
		}
		else {
			losses += 1;
		}
	}
	public static void main (String[] args) {
		
	}

}
