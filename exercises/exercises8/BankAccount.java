package exercises8;

public class BankAccount implements Valuable {

		private int balance;

		public BankAccount(int balance) {
			super();
			this.balance = balance;
		}

		public int getBalance() {
			return balance;
		}
		public void deposit(int funds) {
			this.balance+=funds;
			this.balance-=1;
		}
		
	@Override
	public int getLiquidValue() {
		return this.getBalance();
	}



}
