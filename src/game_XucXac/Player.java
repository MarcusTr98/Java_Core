package game_XucXac;

public class Player {
	private final String name;
	private double balance;

	public Player(String name, double initialBalance) {
		this.name = name;
		this.balance = initialBalance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	// điều chỉnh số dư tài khoản người chơi
	public void adjustBalance(double amount) {
		balance += amount;
	}

	// format số dư sang kiểu tiền VN
	public String formatBalance() {
		return Utils.CURRENCY_FORMAT.format(balance);
	}
}
