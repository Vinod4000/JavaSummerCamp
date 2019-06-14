
public class RPS_Code {
//	private int wins;
//	private int losses;
//	private int ties;
	private int[] history = new int[3];
	private String choice;
	
	RPS_Code() {
//		wins = 0;
//		losses = 0;
//		ties = 0;
		history = new int[] {0, 0, 0};
		choice = "";

	}
	
	RPS_Code (String choice) {
		this.choice = choice;
//		this.wins = 0;
//		this.losses = 0;
//		this.ties = 0;
		this.history[0] = 0;
	}
	
	public int correctChoice(String cho, String comp) {
		if ((cho.equals("rock") && comp.equals("scissors")) || (cho.equals("paper") && comp.equals("rock")) || (cho.equals("scissors") && comp.equals("paper"))) {
//			this.wins += 1;
			this.history[0]++;
			return 1;
		}
		else if (cho.equals(comp)) {
//			this.ties += 1;
			this.history[2]++;
			return 2;
		}
		else {
//			this.losses += 1;
			this.history[1]++;
			return 0;
		}
	}
	
	public String generateComp() {
		String comp = "";
		int rand = (int) (3*Math.random());
		if (rand == 0) {
			comp = "rock";
		}
		if (rand == 1) {
			comp = "paper";
		}
		if (rand == 2) {
			comp = "scissors";
		}
		return comp;
	}
	
	public int getWins() {
		return this.history[0];
	}
	
	public int getLosses() {
		return this.history[1];
	}
	
	public int getTies() {
		return this.history[2];
	}
	
//	public void setWins(int wins) {
//		this.wins = wins;
//	}
//	
//	public void setLosses(int losses) {
//		this.losses = losses;
//	}
//	
//	public void setTies(int ties) {
//		this.ties = ties;
//	}
	public static void main (String[] args) {
		
	}

}
