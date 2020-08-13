package application;

import java.util.Locale;
import java.util.Scanner;

import ententies.Banco;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Banco banco;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();//pra pegar o enter
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n): ");
		char option = sc.next().charAt(0);
		
		if (option=='y') {
			System.out.print("Enter initial deposit value: ");
			double value= sc.nextDouble();
			
			//inicializando o construtor
			banco = new Banco(number,holder,value);
		}
		else {
			banco = new Banco(number,holder);
		}
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(banco.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		banco.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.print(banco.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		banco.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.print(banco.toString());
		
		sc.close();
	}

}


