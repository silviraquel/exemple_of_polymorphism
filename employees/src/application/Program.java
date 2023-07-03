package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees");
		
		int n = input.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + "data: ");
			System.out.print("Outsorced(y/n)? ");
			char ch = input.next().charAt(0);
			System.out.println("Name: ");
			input.nextLine();
			String name = input.nextLine();	
			System.out.print("Hours: ");
			int hours = input.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = input.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour,additionalCharge);
				list.add(emp);
				
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
						
;		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp: list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f",emp.payment()));
		}

		input.close();
	}

}
