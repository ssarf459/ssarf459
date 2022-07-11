package com.Syed;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Salary obj = new Salary();
        obj.input_detail();
        obj.calculate_salary();
        System.out.println("\n\n");
        obj.display_detail();
        obj.show_salary();
    }
}

class Employee{
    String name;
    int employee_ID;
    void input_detail(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter name of the employee: ");
        name = obj.nextLine();
        System.out.print("Enter employee ID: ");
        employee_ID = obj.nextInt();
    }
    void display_detail(){
        System.out.println("Name of the employee: " + name);
        System.out.println("ID of the employee: " + employee_ID);
    }
}

class Salary extends Employee{
    float net_salary, gross_salary, house_rent_allowance, dearness_allowance, income_tax;
    int basic_pay;
    void calculate_salary(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        basic_pay = obj.nextInt();
        house_rent_allowance = (float) (0.1 * basic_pay);
        dearness_allowance = (float) (0.73 * basic_pay);
        gross_salary = (basic_pay + dearness_allowance + house_rent_allowance);
        income_tax = (float) (0.3 * gross_salary);
        net_salary = gross_salary - income_tax;
    }
    void show_salary(){
        System.out.println("Gross Salary: " + gross_salary);
        System.out.println("Net Salary: " + net_salary);
    }
}
