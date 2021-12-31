package ex8;

import java.util.Date;

public class Transaction extends Account {
	private Date date = new Date();
	private char type = ' ';
	private double amount = 0;
	private double balances = 0;
	
	public Transaction() {
		
	}
	
	public Transaction(char type, double amount, double balances) {
		this.setType(type);
		this.setAmount(amount);
		this.setBalances(balances);
		if (this.type == 'D') {
			this.balances += amount;
		}
		else if (this.type == 'W') {
			this.balances -= amount;
		}
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public char getType() {
		return this.type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getBalances() {
		return this.balances;
	}
	
	public void setBalances(double balances) {
	    this.balances = balances;
	}


}
