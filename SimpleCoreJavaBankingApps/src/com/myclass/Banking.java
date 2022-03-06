package com.myclass;

import java.util.Scanner;

public class Banking {
	
	public static void main(String[] args) {
		
	BankAccount bc = new BankAccount(100, "Harinesh");
	int option;
	do{
		bc.showMenu();
		Scanner scanner = new Scanner(System.in);
		option = scanner.nextInt();	
	 switch(option) {
	 	case 1:
	 		System.out.println("===================");
	 		System.out.println("Balance in your Account is"+bc.balance);
	 		break;
	 	case 2:
	 		System.out.println("===================");
	 		System.out.println("Enter the amount to deposit");
	 		Scanner depAmt = new Scanner(System.in);
	 		int amt = depAmt.nextInt();
	 		bc.deposit(amt);
	 		System.out.println(amt +"is deposited successfully");
	 		break;
	 	case 3:
	 		System.out.println("===================");
	 		System.out.println("Enter the amount to withdraw");
	 		Scanner withdrawAmt = new Scanner(System.in);
	 		int wAmt = withdrawAmt.nextInt();
	 		bc.withdraw(wAmt);
	 		System.out.println(wAmt +"is deposited successfully");
	 		break;
	 	case 4:
	 		System.out.println("===================");
	 		if(bc.deposit) {
		 		System.out.println("Previous Transacton"+bc.previousTransAmt+"is deposited in last transaction");
	 		}else {
		 		System.out.println("Previous Transacton"+bc.previousTransAmt+"is withdrawn in last transaction");
	 		}
	 		System.out.println("Prevoius Tansaction");
	 		break;
	 	case 5:
	 		System.out.println("===================");
	 		System.out.println("Thank You! for using our service");
	 		break;
	 	default:
	 		System.out.println("Invalid Option!Please Retry after Sometime..");
	 }

	}while(option != 5);
	
	}
}
