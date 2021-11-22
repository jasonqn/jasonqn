/*
GuessApp.java
J Quinn
4.11.2020
*/

import javax.swing.*;

public class SalaryIncreaseApp{

	public static void main(String args[]){

	//variables
	String position;
	int yearsWorked;
	int salary;
	double finalSalary; //output

	//objects
	SalaryIncrease mySalaryIncrease = new SalaryIncrease();


	//input
	position = JOptionPane.showInputDialog(null,"Enter your position within the company");
	mySalaryIncrease.setPosition(position);

	yearsWorked = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter how many years you have worked here?"));
	mySalaryIncrease.setYearsWorked(yearsWorked);

	salary = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your current salary?"));
	mySalaryIncrease.setSalary(salary);

	//compute
	mySalaryIncrease.compute();

	//output
	finalSalary = mySalaryIncrease.getFinalSalary();
	JOptionPane.showMessageDialog(null, "Your salary increased too: " +finalSalary);


	}

}
