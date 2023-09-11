package Question1;

class Account {

	private float interest;
	
	void calculatingInterest(float principle_amount, float number_of_years, float rate_of_interest) {
		this.interest = (principle_amount*number_of_years*rate_of_interest)/100;
	}
	
	public float setInterest(float interest) {
		return this.interest = interest;
	}

	public float getInterest() {
		return interest;
	}

}

class SavingsAccount extends Account{
	
	void calculateInterest(float principle_amount, float number_of_years, float rate_of_interest) {
		super.calculatingInterest(principle_amount, number_of_years, rate_of_interest);;
	}

}

class CurrentAccount extends Account{
	
	void calculateInterest(float principle_amount, float number_of_years, float rate_of_interest) {
		super.calculatingInterest(principle_amount, number_of_years, rate_of_interest);
	}

}

public class Question1 {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		sa.calculateInterest(10000, 5, 2);
		ca.calculateInterest(5000, 3, 3);
		System.out.println(sa.getInterest());
		System.out.println(ca.getInterest());
	}
}
