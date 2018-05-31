package Classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		
		tom.firstName = "Tom";
		tom.lastName = "Smith";
		tom.age = 21;
		tom.accountBalance = 10000;
		tom.testEligibility();
		
		henry.firstName="Henry";
		henry.lastName="Miller";
		henry.age=31;
		henry.accountBalance=20000;
		henry.testEligibility();
		
		
		System.out.println("Is tom eligible for Credit Card : "+tom.eligibleForCreditCard);
		System.out.println("Is henry eligible for Credit Card : "+henry.eligibleForCreditCard);
		

	}

}
