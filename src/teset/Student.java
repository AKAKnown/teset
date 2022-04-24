/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teset;

/**
 *
 * @author mohme
 */
public class Student extends Person{

    public Student(Course c, Semster s,String name,int age ,String address,Gender g) {
       super(name,age,address,g);
        this.c = c;
        this.s = s;
         
    }

    public Course getC() {
        return c;
    }

    public void setC(Course c) {
        this.c = c;
    }

    public Semster getS() {
        return s;
    }

    public void setS(Semster s) {
        this.s = s;
    }
   private Course c;
   private Semster s; 
   
    
}

enum Course{
 DATA_BASE,PROGRAMER,MATH
}
enum Semster{
 SUMMER,WINTER,FALL,SPRING

}