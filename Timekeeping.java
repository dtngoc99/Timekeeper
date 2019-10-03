/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7_Timekeeper;

import java.util.Calendar;


/**
 *
 * @author NGOC TY
 */
public class Timekeeping {
    protected int checkInHour=0;
    protected int checkInMinute=0;
    protected int checkOutHour=0;
    protected int checkOutMinute=0;
    protected int checkInDay=0;
    protected int checkInMonth=0;
    public void checkIn(){
        Calendar cal= Calendar.getInstance();
        checkInHour=cal.get(Calendar.HOUR);
        checkInMinute=cal.get(Calendar.MINUTE);
        checkInDay=cal.get(Calendar.DAY_OF_MONTH);
        checkInMonth=cal.get(Calendar.MONTH);
        
    }
    public void checkOut(){
        Calendar cal= Calendar.getInstance();
        checkOutHour=cal.get(Calendar.HOUR);
        checkOutMinute=cal.get(Calendar.MINUTE);
    }
    
}
