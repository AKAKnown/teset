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
public class Employee {

    public int getSalry() {
        return salry;
    }

    public void setSalry(int salry) {
        this.salry = salry;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public double compSallyer(Employee e){
        if(salry > e.getSalry()){
         return salry;
        }else{
        return e.getSalry();
        }
    
    }

    public Employee(int salry, double rank, String job) {
        this.salry = salry;
        this.rank = rank;
        this.job = job;
    }
   private int salry ;
    private double rank;
   private  String job;
    
}

class HourlyEmployee extends Employee{

    public HourlyEmployee(int hours, double rate,int salry,double rank,String job) {
        super(salry,rank,job);
        this.hours = hours;
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getSumSalary(){
    return hours*rate;
    }
private int hours;
private double rate;

}
class SalaryEmployee extends Employee{

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getDedictions() {
        return dedictions;
    }

    public void setDedictions(int dedictions) {
        this.dedictions = dedictions;
    }
     public double getSumSalary(){
         double sum=getSalry()+bonus-dedictions;
         System.out.println("this is sum"+sum);
    return sum;
    }
   private double bonus;
   private int dedictions;
    public SalaryEmployee(int salry, double rank, String job,double bonuns, int dedictions) {
        super(salry, rank, job);
        this.bonus=bonuns;
        this.dedictions=dedictions;
    }
}