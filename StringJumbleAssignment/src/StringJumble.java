import java.lang.*;

public class StringJumble {
	public String str;
	
	StringJumble() {
		str = "";
	}
	
	StringJumble(String str) {
		this.str = str;
	}
	
	static String mixer(String input) {
		String cuts[] = new String[3];
		String output = "";
		for (int i = 0; i < 3; i++) {
			int randomX = (int)(input.length() * Math.random());
			int randomY = (int)(input.length() * Math.random());
			if (randomY < randomX) {
				cuts[i] = input.substring(randomY, randomX);
			}
			else {
				cuts[i] = input.substring(randomX, randomY);
			}
			output += cuts[i];
		}
		return output;

	}

	public static void main(String[] args) {
		StringJumble jum = new StringJumble("rhinoceros");
		System.out.println(mixer(jum.str));
	}

}
