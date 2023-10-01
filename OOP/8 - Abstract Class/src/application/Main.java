package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        list.add(new BusinessAccount(1001, "Bob", 1000.0, 300.0));
        list.add(new SavingsAccount(1002, "Maria", 1000.0, 0.01));
        list.add(new BusinessAccount(1003, "Bob", 1000.0, 500.0));
        list.add(new SavingsAccount(1004, "Luís", 1000.0, 0.02));

        double sum = 0.0;
        for (Account acc: list) acc.deposit(100);

        for (Account acc : list) sum += acc.getBalance();

        System.out.println(sum);
    }
}