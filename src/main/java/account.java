
import java.io.*;
import java.util.Date;

import exception.InsufficientFundsException;

public class account {
	private int id;
	//This is for the account
	private double balance;
	
	private double annualInterestRate; //that stores the current interest rate, assume all accounts have the same interest rate
	
	private Date dateCreated;
	
	


	public account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
		
	}

	public account(int id, double balance) {
		this(id,balance,0);
		dateCreated = new Date();
	}

	public account() {
		this(0,0,0);
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public void deposit(double amount){
		balance+=amount;
	}
	

	public double getMonthlyInterstRate(){
		return annualInterestRate/12;
		}
	
		
	public void withdraw(double amount)throws InsufficientFundsException{ 
		if (amount <= balance)
		{
			balance -= amount;
		}
		else
		{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}}}
	
	


	
