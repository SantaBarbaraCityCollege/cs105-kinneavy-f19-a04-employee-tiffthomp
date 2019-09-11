/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Tiffany Thompson (K00956564)
 */
package edu.sbcc.cs105;

/**
 * This class implements an employee, which is a person with a name and a salary.
 *
 * @param employeeName
 *            Employee's name
 * @param currentSalary
 *            Employee's current salary
 * 
 */
public class Employee {
    String employeeName;
    double currentSalary;

    /**
     * Default constructor. Creates a new Employee with an "Unknown" name
     * and a salary of 0.
     * 
     */
     public Employee(){
         this("Unknown",0);
     }

    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
    public Employee(String employeeName, double currentSalary) {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
    }

    /**
     * @return employee's name.
     */
    public String getName() {
		return employeeName;
    }

    /**
     * @return employee's curent salary.
     */
    public double getSalary() {
		return currentSalary;
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    public void raiseSalary(double byPercent) {
		currentSalary += (currentSalary * (byPercent / 100));
    }
}