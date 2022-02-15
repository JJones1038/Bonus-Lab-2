/**
Employee Class

Author: Kenneth Jones

Date: 02/14/2022

*/

public class Employee {
    // Variables
    private String name;
    private int emp_num;
    
    // Constructor
    public Employee(String name, int emp_num){
        this.name = name;
        this.emp_num = emp_num;
    }
    
    public String getName(){
        return name;
    }
    
    public int get_emp_num(){
        return emp_num;
    }
    
    public static void printClassInfo(){
        System.out.println("Employee class creates a blueprint of employee.");
    }
}
