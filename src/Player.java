public abstract class Player {

	String name;

	public String getName() {

		return name;
	}

	public abstract String generateRoshambo();

	public Player(String name) {

		super();
		this.name = name;
	}
}
