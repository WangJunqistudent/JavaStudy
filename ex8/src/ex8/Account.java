package ex8;

import java.util.Date;
import java.util.ArrayList;

public class Account {
	private String name = "";
	private ArrayList transactions = new ArrayList(); //创建数组存放每笔交易
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;  //年利率
	private Date dateCreated = new Date();  //账户创建日期
	
	public Account() {
		
	}
	
	public Account(String name, int id, double balance) {
		this.setName(name);
		this.setId(id);
		this.setBalance(balance);
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 1200;
	}
	
	public double getMonthlyInterest() {
		return this.balance * getMonthlyInterestRate();
	}
	
	public ArrayList getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList transactions) {
		this.transactions = transactions;
	}

	public void withDraw(double amount) {
		Transaction wTransaction = new Transaction('W', amount, this.getBalance());
		this.setBalance(wTransaction.getBalances());
		transactions.add(wTransaction);
	}
	
	public void deposit(double amount) {
		Transaction dTransaction = new Transaction('D', amount, this.getBalance());
		this.setBalance(dTransaction.getBalances());
		transactions.add(dTransaction);
	}

	
}