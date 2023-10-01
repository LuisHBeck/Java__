package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int employeesNumber;

        System.out.print("Enter the number of employees: ");
        employeesNumber = sc.nextInt();

        for (int i=0; i<employeesNumber; i++) {
            System.out.printf("Employee #%d data: \n", i+1);
            collectEmployeeData(employees, sc);
        }

        for (Employee employee : employees) {
            System.out.printf("%s - R$%.2f", employee.getName(), employee.payment());
            System.out.println();
        }
        sc.close();
    }

    public static void collectEmployeeData (List list, Scanner sc) {
        String name;
        int hours, isOutsourced;
        double valuePerHour, additionalCharge;

        System.out.print("Name: ");
        name = sc.next();

        System.out.print("Hours: ");
        hours = sc.nextInt();

        System.out.print("Value per hour: R$");
        valuePerHour = sc.nextDouble();

        System.out.print("Outsourced (1/0)");
        isOutsourced = sc.nextInt();

        if (isOutsourced == 1) {
            System.out.print("Additional charge: R$");
            additionalCharge = sc.nextDouble();
            list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
        }else {
            list.add(new Employee(name, hours, valuePerHour));
        }
    }
}