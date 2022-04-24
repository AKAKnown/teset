/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teset;

import java.util.ArrayList;
import java.util.Scanner;

public class Teset {

    public static void main(String[] args) {
       Student s=new Student(Course.PROGRAMER,Semster.SPRING,"mohamed",25,"teiply",Gender.Man);
       Student s1=new Student(Course.DATA_BASE,Semster.FALL,"ali",20,"teiply",Gender.Man);
        System.out.println(s.getName());
        
        HourlyEmployee he=new HourlyEmployee(25,2.5,2500,5.5,"moblie programer");
        HourlyEmployee h2=new HourlyEmployee(25,2.5,2500,5.5,"moblie programer");
        
        SalaryEmployee se1=new SalaryEmployee(2500,2.5,"devolper",50.5,100);
        SalaryEmployee se2=new SalaryEmployee(300,3.5,"programmer",50.5,200);
        ArrayList<Student> students=new ArrayList<>();
       
        students.add(s);
        students.add(s1);
     
        ArrayList<SalaryEmployee> salartyEm=new ArrayList<>();
        salartyEm.add(se1);
        salartyEm.add(se2);
        
        SalaryEmployee sel=salartyEm.get(0);
        System.out.println(sel.getSumSalary());
        System.out.println(h2.getSumSalary());
    }    
    

}


