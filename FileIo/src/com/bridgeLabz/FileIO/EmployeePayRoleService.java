package com.bridgeLabz.FileIO;

/*
 * UC1- Started Employee Payroll Service
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeePayRoleService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    private List<EmployeePayRollData> employeePayrollList;

    public EmployeePayRoleService(ArrayList<EmployeePayRoleService> employeePayrollList) {
    }

    public EmployeePayRoleService(List<EmployeePayRollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {

        System.out.println("Enter the Employee Id : ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter the Employee Name : ");
        String name = consoleInputReader.next();
        System.out.println("Enter the Employee Salary : ");
        double salary = consoleInputReader.nextDouble();

        employeePayrollList.add(new EmployeePayRollData(id, name, salary));
    }

    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roster to Console\n" + employeePayrollList);
    }

    public static void main(String[] args) {

        System.out.println("---------- Welcome To Employee Payroll Application ----------\n");
        ArrayList<EmployeePayRoleService> employeePayrollList  = new ArrayList<EmployeePayRoleService>();
        EmployeePayRoleService employeePayrollService = new EmployeePayRoleService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);

        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();

    }

}
