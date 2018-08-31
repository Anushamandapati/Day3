package com.capgemini.icici.domain;

public class BankAccount 
{
	private long accId;
	private String accHolderName;
	private String accType;
	private double balance;
	
	public BankAccount() 
	{
	}
	
	public BankAccount(long accId, String accHolderName, String accType, double balance)
	{
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.balance = balance;
	}
	
	public double withdraw(double amount) 
	{
		if(balance - amount >= 0)
			balance = balance - amount;
		else
			System.out.println("You don't have sufficient balance.");
		return balance;
	}
	
	public double deposit(double amount) 
	{
		balance = balance + amount;
		return balance;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void displayBankAccountDetails() 
	{
		System.out.println("Account Id : " + accId + "\nAccount holder name: " + accHolderName +  
				"\nAccount type: " + accType + "\nAccount balance: " + balance);
	} 
 } 


