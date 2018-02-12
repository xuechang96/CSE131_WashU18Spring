package bankinterest;

public class BankInterest {

	public static void main(String[] args) {

		System.out.println("Day   Type        Amount     Balance");
		double s=4000;
		for (int i=1;i<=30;i++) {
			if (Math.random()>0.5) {
				s=s+200.5;
				if (i<10) {
				System.out.println(i+"     Deposit     $"+200.50+"     "+s);
			}
				else {
				System.out.println(i+"    Deposit     $"+200.50+"     "+s);
				}
			}
			else {
				s=s-100;
				if (i<10) {
				System.out.println(i+"     withdraw    $"+100.00+"     "+s);
				}
				else {
				System.out.println(i+"    withdraw    $"+100.00+"     "+s);
				}
			}
		}
		double interest=s*0.02;
		System.out.println("Interest earned:   "+interest);
		System.out.println("Money after one month's interest: "+(s+interest));
	}

}
