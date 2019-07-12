public class RockPlayer extends Player {

	public RockPlayer(String name) {

		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateRoshambo() {

		return Roshambo.ROCK.toString();
	}
}
