package strategy;
public class Main {

	public static void main(String[] args) {

		CashRegisterThailand registerTH = new CashRegisterThailand();
		CashRegisterNY registerNY = new CashRegisterNY();
		CashRegisterCA registerCA = new CashRegisterCA();

		registerTH.recordPurchase(60);
		registerTH.recordPurchase(40);
		registerTH.calculateTax();
		registerTH.enterPayment(200);
		
		registerNY.recordPurchase(60);
		registerNY.recordPurchase(40);
		registerNY.calculateTax();
		registerNY.enterPayment(200);
		
		registerCA.recordPurchase(60);
		registerCA.recordPurchase(40);
		registerCA.calculateTax();
		registerCA.enterPayment(200);

		double changeTH = registerTH.giveChange();
		System.out.println(changeTH);
		
		double changeNY = registerNY.giveChange();
		System.out.println(changeNY);
		
		double changeCA = registerCA.giveChange();
		System.out.println(changeCA);
	}
}
