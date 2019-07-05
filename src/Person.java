package src;

public class Person extends Piggy {
	private String name;
	String n;

	public Person(String name, Money[] money) {
		super(money);
		setName(name);
	}

	@Override
	public String toString() {
		return (name + ":\nPrimer Ahorro: " + savings[0].getMoney() + "\nSegundo Ahorro: " + savings[1].getMoney()
				+ "\nTercer Ahorro: " + savings[2].getMoney() + "\nCuarto Ahorro: " + savings[3].getMoney()
				+ "\nQuinto Ahorro: " + savings[4].getMoney());
	}

	public String getName() {
		return name;
	}

	public void setName(String personName) {
		this.name = personName;
	}
}
