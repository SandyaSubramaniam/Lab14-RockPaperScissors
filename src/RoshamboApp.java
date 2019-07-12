import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String usercontinue = "Y";
		System.out.println("Welcome to Rock Paper Scissors");
		String user = Validator.getString(scanner, "Enter your name: ");
		Player consoleplayer = new ConsolePlayer(user, scanner);
		Player opponent = selectOpponent(scanner);
		do {
			String cpchoice = consoleplayer.generateRoshambo();
			String opchoice = opponent.generateRoshambo();
			int winner = winner(cpchoice, opchoice);
			System.out.println(cpchoice + " " + opchoice);
			if (winner == 0) {
				System.out.println("Draw!");
			} else if (winner == 1) {
				System.out.println(consoleplayer.getName() + " wins!");
			} else if (winner == 2) {
				System.out.println(opponent.getName() + " wins!");
			}
			String[] validValues = { "y", "n" };
			usercontinue = Validator.getStringMatching(scanner, "Play again? (y/n)", validValues);
		} while (usercontinue.equalsIgnoreCase("Y"));
		System.out.println("Goodbye!");
		scanner.close();
	}

	private static Player selectOpponent(Scanner scanner) {

		String[] validValues = { "J", "S" };
		String opponentChoice = Validator.getStringMatching(scanner,
				"Would you like to play against the Jets or the Sharks(j/s)?:", validValues);
		Player opponent;
		if (opponentChoice.equalsIgnoreCase("J")) {
			opponent = new RandomPlayer("Jets");
		} else {
			opponent = new RockPlayer("Sharks");
		}
		return opponent;
	}

	public static int winner(String player1choice, String player2choice) {

//0 = draw, 1 = player1 win, 2 =player2 win
		int result = 0;
		if (player1choice.equalsIgnoreCase(player2choice)) {
			result = 0;
		} else if ((player1choice.equalsIgnoreCase("ROCK") && player2choice.equalsIgnoreCase("SCISSORS"))
				|| (player1choice.equalsIgnoreCase("SCISSORS") && player2choice.equalsIgnoreCase("PAPER")
						|| (player1choice.equalsIgnoreCase("PAPER") && player2choice.equalsIgnoreCase("ROCK")))) {
			result = 1;
		} else {
			result = 2;
		}
		return result;
	}
}
