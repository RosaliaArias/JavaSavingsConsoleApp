package src;

public class Piggy {

	Money[] savings = new Money[5];

	public Piggy(Money[] money) {
		setSavings(money);
	}

	public Money[] getSavings() {
		return savings;
	}

	public void setSavings(Money[] money) {
		this.savings = money;
	}

	public void save(Money money) {
		for (int i = 0; i < savings.length; i++) {
			savings[i] = new Money(money.getMoney());
		}
	}
}
