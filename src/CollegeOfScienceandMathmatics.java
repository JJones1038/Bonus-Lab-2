/*
Bonus Lab 2
Create a Database with two classes named Employee.java and Department.java
Add the department names and employees with their employee numbers.
In the main class CollegeOfScienceandMathmatics, call the data from the other
two classes and print out the data. Also track the total number of departments
and have that display in your output.

Author: Kenneth Jones

Date: 02/14/2022
*/
import java.time.LocalDate;

public class CollegeOfScienceandMathmatics {

    public static void main(String[] args) {
        // First Department
        String dept_name1 = "MCIS";
        LocalDate mcis_added_to_db = LocalDate.of(2012, 4, 29);
        Employee mcis_emp1 = new Employee("Dr. Case", 1);
        Employee mcis_emp2 = new Employee("Dr. Ghosh", 2);
        
        Department mcis = new Department(dept_name1, mcis_added_to_db, mcis_emp1, mcis_emp2, mcis_emp1, mcis_emp2);
        Department.no_of_departments++;
        // Second Department
        String dept_name2 = "Biology";
        LocalDate bio_added_to_db = LocalDate.now();
        Employee bio_emp3 = new Employee("Kenneth Jones", 3);
        Employee bio_emp4 = new Employee("Rebecca Jones", 4);
        
        Department bio = new Department(dept_name2, bio_added_to_db, bio_emp3, bio_emp4, bio_emp3, bio_emp4);
        Department.no_of_departments++;
        // Prints out First Department Data
        System.out.println(mcis.getName());
        System.out.println(mcis.getDateAddedToDB());
        System.out.println(mcis.getEmp1());
        System.out.println(mcis.getEmp2() + "\n");
        // Prints out Second Department Data
        System.out.println(bio.getName());
        System.out.println(bio.getDateAddedToDB());
        System.out.println(bio.getEmp3());
        System.out.println(bio.getEmp4() + "\n");
        
        
        System.out.println("Total number of departments created = " + Department.getNo_of_departments());
        
        // Department Class Info
        Department.printClassInfo();
        
        // Employee Class Info
        Employee.printClassInfo();
        
        // Before submit, please add Biology department to your test code
    }
    
}
