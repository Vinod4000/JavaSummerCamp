
public class Pokemon {

	
	String name;
	String type;
	int hp;
	String move1;
	String move2;
	String move3;
	String move4;

	Pokemon() {
		name = "";
		type = "";
		hp = 0;
		String move1 = "";
		String move2 = "";
		String move3 = "";
		String move4 = "";
	}
	
	//overload
	
	Pokemon (String name, String type, int hp, String move1, String move2, String move3, String move4) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.move1 = move1;
		this.move2 = move2;
		this.move3 = move3;
		this.move4 = move4;
	}
	
	public String getMove1() {
		return this.move1;
	}
	public String getMove2() {
		return this.move2;
	}
	public String getMove3() {
		return this.move3;
	}
	public String getMove4() {
		return this.move4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pokemon Pikachu = new Pokemon("Pikachu", "electric", 250, "thunder", "quick attack", "headbutt", "tackle");
		//Pokemon Charizard = new Pokemon("Charizard", "fire", 400, "flamethrower", "fly", "aerial ace", "slash");

	}

}
