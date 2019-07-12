import java.util.Scanner;

public class ConsolePlayer extends Player {

	private Scanner scnr;

	public ConsolePlayer(String name, Scanner scanner) {

		super(name);
		this.scnr = scanner;
		// TODO Auto-generated constructor stub
	}

	public String generateRoshambo() {

		String[] pattern = { "ROCK", "PAPER", "SCISSORS" };
		String strChoice = Validator.getStringMatching(scnr, "Enter ROCK, PAPER OR SCISSORS:", pattern);
		return strChoice;
	}
}
