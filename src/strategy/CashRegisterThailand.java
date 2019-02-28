package strategy;
public class CashRegisterThailand implements CashRegister {
	private double purchase; // total amount of product price bought
	private double payment; // total amount of payment

	public CashRegisterThailand() {
		purchase = 0;
		payment = 0;
	}

	public void recordPurchase(double amount) {
		purchase += amount;
	}

	@Override
	public void calculateTax() {
		purchase = purchase + (purchase * 0.07);
	}

	public void enterPayment(double amount) {
		payment += amount;
	}

	public double giveChange() {
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}

}
