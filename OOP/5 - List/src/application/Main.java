package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int listSize, employeeId;
        String employeeName;
        Double employeeSalary;
        Boolean employeeExists = false;

        System.out.print("How many employees will be registered? ");
        listSize = sc.nextInt();

        for (int i=0; i<listSize; i++) {
            System.out.printf("Employee #%d \n", i+1);
            System.out.print("Id: ");
            employeeId = sc.nextInt();
            System.out.print("Name: ");
            sc.next();
            employeeName = sc.nextLine();
            System.out.print("Salary: R$");
            employeeSalary = sc.nextDouble();
            System.out.println();

            employees.add(new Employee(employeeId, employeeName, employeeSalary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        employeeId = sc.nextInt();


        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employeeExists = true;
            }
            if (employeeExists) {
                System.out.print("Enter the percentage: ");
                employee.increaseSalary(sc.nextDouble());
            }
        }

        if (!employeeExists) {
            System.out.println("This id doesn't exist!");
        }

        System.out.println("List of employees");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        sc.close();
    }
}