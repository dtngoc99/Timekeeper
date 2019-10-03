/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7_Timekeeper;

/**
 *
 * @author NGOC TY
 */
public abstract class Employee extends Timekeeping{
    protected int employeeID;
    protected String employeeName;
    protected int workday=0;
    protected float numberOfHourLate=0;
    
    
    public float getNumberOfHourLate() {
        return numberOfHourLate;
    }

    public int getWorkday() {
        return workday;
    }

    public void setNumberOfHourLate(float numberOfHourLate) {
        this.numberOfHourLate = numberOfHourLate;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public Boolean Holiday(int day,int month){
        switch(month){
            case 4:
                switch(day){
                    case 30:
                        return true;
                }
            case 5:
                switch(day){
                    case 1:
                        return true;
                }
            case 9:
                switch(day){
                    case 2:
                        return true;
                }
            default:return false;
        }
    }
    public void hourLate(){
        if(super.checkInHour>=8){
            numberOfHourLate+=((super.checkInHour-8) +(super.checkInMinute/60f));
        }
        if(super.checkOutHour<=16){
            numberOfHourLate+=((16-super.checkOutHour) -(super.checkOutMinute/60f));
        }
        if(Holiday(checkInDay,checkInMonth)){
            workday+=3;
        }
        else if(checkInHour!=0){
            workday++;
        }
        
    }
}
