public class RandomPlayer extends Player {

	public RandomPlayer(String name) {

		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateRoshambo() {

		int randomnum = (int) (Math.random() * 3 + 1);
		String result;
		if (randomnum == 0) {
			result = "ROCK";
		} else if (randomnum == 1) {
			result = "PAPER";
		} else {
			result = "SCISSORS";
		}
		return result;
	}
}
