package Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EmployeeSort {
    public static void main(String[] args) {
        List <Employee> employees = new ArrayList <Employee> ();
        employees.add(new Employee(10, "Dinesh", 18000));
        employees.add(new Employee(16, "Pankaj", 19000));
        employees.add(new Employee(13, "Mayur", 14000));
        employees.add(new Employee(9, "Pravin", 22000));
 
        System.out.println("----Sort By Employee Id----");
        Collections.sort(employees, new EmployeeSortById());
 
        printEmployees(employees);
 
        System.out.println("\n----Sort By Employee Name----");
        Collections.sort(employees, new EmployeeSortByName());
 
        printEmployees(employees);
 
    }
 
    // print employee
    public static void printEmployees(List <Employee> employees) {
        for (Employee e: employees) {
            System.out.println("Id->" + e.emplId + " Name -> " + e.empName + " Salary-> " + e.empSalary);
        }
    }
 
}