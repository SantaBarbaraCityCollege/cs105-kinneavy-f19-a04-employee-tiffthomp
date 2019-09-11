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
 * This class provides first level testing the Employee object.
 *
 */
public class Program {

     /** 
     * Create an employee and test that the proper name has been created. Test
     * the initial salary amount and then give the employee a raise. Then check
     * to make sure the salary matches the raised salary.
     * 
     * 
     * @param args
     *            command line values. Not used in this example.
     * @param defaultEmployee
     *            default employee, with no name or salary specified
     * @param defaultName
     *            default employee name when nothing is specified by user.
     * @param defaultSalary
     *            default employee salary when nothing is specified by user.
     * @param harry
     *            first new employee.
     * @param harryName
     *            Harry's name.
     * @param harrySalary
     *            Harry's current salary.
     * @param sally
     *            second new employee.
     * @param sallyName
     *            Sally's name.
     * @param sallySalary
     *            Sally's current salary.
     */
    public static void main(String[] args) {
        String defaultName; // Default employee name
        double defaultSalary;  // Default employee salary
        String harryName;   // Harry's name
        double harrySalary;    // Harry's current salary
        String sallyName;   // Sally's name
        double sallySalary;    // Sally's current salary

        // Create a default Employee with default name and salary values
        Employee defaultEmployee = new Employee();
        defaultName = defaultEmployee.getName();
        System.out.println(defaultName);
        defaultSalary = defaultEmployee.getSalary();
        System.out.println(defaultSalary);

        // Create an Employee named Harry, who has a salary of 10,000
        Employee harry = new Employee("Harry", 10000);
        harryName = harry.getName();
        System.out.println(harryName);
        harrySalary = harry.getSalary();
        System.out.println(harrySalary);

        // Harry gets two 10% raises
        harry.raiseSalary(10); // First raise
        harrySalary = harry.getSalary();
        System.out.println(harryName + " after 1st raise: " + harrySalary);
        harry.raiseSalary(10); // Second raise
        harrySalary = harry.getSalary();
        System.out.println(harryName + " after 2nd raise: " + harrySalary);

        // Harry gets a 10% salary cut
        harry.raiseSalary(-10);
        harrySalary = harry.getSalary();
        System.out.println(harryName + " after pay cut: " + harrySalary);

        // Create an Employee named Sally, who is a volunteer with a salary of 0
        Employee sally = new Employee("Sally", 0);
        sallyName = sally.getName();
        sallySalary = sally.getSalary();
        System.out.println(sallyName);
        System.out.println(sallySalary);

        // Sally gets a 0.5% raise... on her non-existent salary of 0
        sally.raiseSalary(0.5);
        sallySalary = sally.getSalary();
        System.out.println(sallyName + " after raise: " + sallySalary);

        // Sally is hired full-time, with a salary of 50000
        sally = new Employee("Sally", 50000);
        sallyName = sally.getName();
        sallySalary = sally.getSalary();
        System.out.println(sallyName + " new salary: " + sallySalary);

        // Sally gets a 50% salary cut
        sally.raiseSalary(-50);
        sallySalary = sally.getSalary();
        System.out.println(sallyName + " after pay cut: " + sallySalary);
    }
}