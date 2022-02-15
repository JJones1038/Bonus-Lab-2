/*
Department Class

Author: Kenneth Jones

Date: 02/14/2022
*/

import java.time.LocalDate;

public class Department {
    // Variables
    public static int no_of_departments = 0; // Keeps total number of departments created
    
    private String name;
    private LocalDate dateAddedToDB;
    private Employee emp1;
    private Employee emp2;
    private Employee emp3;
    private Employee emp4;
    
    public Department(String name, LocalDate dateAddedToDB, Employee emp1, Employee emp2, Employee emp3, Employee emp4){
        this.name = name;
        this.dateAddedToDB = dateAddedToDB;
        this.emp1 = emp1;
        this.emp2 = emp2;
        this.emp3 = emp3;
        this.emp4 = emp4;
        
    }
    
    public static int getNo_of_departments(){
        return no_of_departments;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmp1(){
        return emp1.getName();
    }
    
    public String getEmp2(){
        return emp2.getName();
    }
    
    public String getEmp3(){
        return emp3.getName();
    }
    
    public String getEmp4(){
        return emp4.getName();
    }
    
    public LocalDate getDateAddedToDB(){
        return dateAddedToDB;
    }
    
    public static void printClassInfo(){
        System.out.println("Department class creates a blue print of department");
    }
}
