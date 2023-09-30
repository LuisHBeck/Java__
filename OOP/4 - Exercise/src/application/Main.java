package application;

import entities.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int accountNumber, firstDeposit;
        double value;
        BankAccount account;

        System.out.println("Welcome to BECK's BANK!");

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        name = sc.next();


        System.out.print("Is there an initial deposit?");
        firstDeposit = sc.nextInt();

        if (firstDeposit == 1) {
            System.out.println("Enter the value: R$");
            value = sc.nextDouble();
            account = new BankAccount(accountNumber, name, value);
        }else {
            account = new BankAccount(accountNumber, name);
        }

        accountDataPrint(account);

        System.out.print("Enter a deposit value: R$");
        account.deposit(sc.nextDouble());
        accountDataPrint(account);

        System.out.print("Enter a withdraw value: R$");
        account.withdraw(sc.nextDouble());
        accountDataPrint(account);

        sc.close();
    }

    public static void accountDataPrint(BankAccount account) {
        System.out.println("Account data:");
        System.out.println(account);
    }

}