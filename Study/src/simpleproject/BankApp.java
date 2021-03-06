package simpleproject;

import java.util.Scanner;

public class BankApp {
	
	private static Account[] accountArray =  new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.Create Account | 2.Account List | 3.Deposit | 4.Withdraw | 5.Exit");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("Select >");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				createAccount();
			}else if(choice == 2) {
				showAccountList();
			}else if(choice == 3) {
				deposit();
			}else if(choice == 4) {
				withdraw();
			}else if(choice == 5) {
				System.out.println("Shutdown Account Application");
				run = false;
			}else {
				System.out.println("Input Correct Number");
			}
		}
	}
	
	public static void createAccount() {
		System.out.println("-------------------------");
		System.out.println("    Create Account");
		System.out.println("-------------------------");
		
		System.out.println("Account Number : ");
		//nextLint : 한 줄이나 문장 / next : 한 단어, 공백 발견시 그 앞까지String 리턴
		String ano = sc.next();
		
		System.out.println("Account owner :");
		String owner = sc.next();
		
		System.out.println("Deposit :");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("Account is created");
				System.out.println(accountArray[i].getAno() + ", " +
						accountArray[i].getOwner() + ", " + accountArray[i].getBalance()
						);
				
				break;
			}
		}
	}
	
	public static void showAccountList() {
		System.out.println("-------------------------");
		System.out.println("    Account List ");
		System.out.println("-------------------------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getAno());
				System.out.print("\t");
			}
		}
	}
	
	public static void deposit() {
		System.out.println("-------------------------");
		System.out.println("        Deposit   ");
		System.out.println("-------------------------");
		
		System.out.println("Account Number : ");
		String ano = sc.next();
		System.out.println("How much do you want to deposit : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("incorrect account number");
			return;
		}
		account.setBlance(account.getBalance() + money);
		System.out.println("deposit complete. balance : " + account.getBalance());
	}
	
	public static void withdraw() {
		System.out.println("-------------------------");
		System.out.println("        Withdraw   ");
		System.out.println("-------------------------");

		System.out.println("Account Number : ");
		String ano = sc.next();
		System.out.println("How much do you want to deposit : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("incorrect account number");
			return;
		}
		account.setBlance(account.getBalance() - money);
		System.out.println("withdraw complete. balance : " + account.getBalance());
	}
	
	
	public static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
			
		}return account;
	}
	
}
