package week3.day1;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Minimum balance is 5000");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();

	}
}
