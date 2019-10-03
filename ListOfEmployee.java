/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7_Timekeeper;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGOC TY
 */
public class ListOfEmployee {
    ArrayList<OfficialStaff> staffList=new ArrayList<>();
    ArrayList<Part_timeEmployee> peList= new ArrayList<>();
    Scanner scan;
    public void readFileOfficialStaff(){
        try {
            scan=new Scanner(Paths.get("D:\\NetBean\\Java\\JavaApplication6\\src\\Bai7_Timekeeper\\Staff.txt"), "UTF-8");
            while(scan.hasNextLine()){
                OfficialStaff staff=new OfficialStaff();
                staff.employeeID=scan.nextInt();
                staff.setWorkday(scan.nextInt());
                staff.setNumberOfHourLate(scan.nextFloat());
                staff.employeeName=scan.nextLine().trim();
                staffList.add(staff);
            }
            scan.close();
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void writeFileOfficialStaff() throws UnsupportedEncodingException, IOException{
        try {
            try (FileOutputStream fos = new FileOutputStream("D:\\NetBean\\Java\\JavaApplication6\\src\\Bai7_Timekeeper\\Staff.txt");
                    OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
                    BufferedWriter bw = new BufferedWriter(osw))
            {
                for(OfficialStaff sf: staffList){
                    bw.write(String.valueOf(sf.employeeID)+" ");
                    bw.write(String.valueOf(sf.getWorkday())+" ");
                    bw.write(String.valueOf(sf.getNumberOfHourLate())+" ");
                    bw.write(sf.employeeName+"\n");
                }
                        bw.close();
                        osw.close();
                        fos.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListOfEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    public void outputStaffList(){
        for(OfficialStaff a:staffList){
            System.out.println("ID: "+a.employeeID);
            System.out.println("Name: "+a.employeeName);
            System.out.println("WorkDay: "+a.getWorkday());
            System.out.println("HourLate: "+a.getNumberOfHourLate());
            
        }
    }
    public void readFileParttimeEmployee(){
          try {
            scan=new Scanner(Paths.get("D:\\NetBean\\Java\\JavaApplication6\\src\\Bai7_Timekeeper\\Part-time.txt"), "UTF-8");
            while(scan.hasNextLine()){
                Part_timeEmployee pe=new Part_timeEmployee();
                pe.employeeID=scan.nextInt();
                pe.workday=scan.nextInt();
                pe.setNumberOfHourLate(scan.nextFloat());
                pe.employeeName=scan.nextLine().trim();
                peList.add(pe);
            }
            scan.close();
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void writeFileParttimeEmployee() throws UnsupportedEncodingException, IOException{
        try {
            try (FileOutputStream fos = new FileOutputStream("D:\\NetBean\\Java\\JavaApplication6\\src\\Bai7_Timekeeper\\Part-time.txt");
                    OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
                    BufferedWriter bw = new BufferedWriter(osw))
            {
                for(Part_timeEmployee pe: peList){
                    bw.write(String.valueOf(pe.employeeID)+" ");
                    bw.write(String.valueOf(pe.getWorkday())+" ");
                    bw.write(String.valueOf(pe.getNumberOfHourLate())+" ");
                    bw.write(pe.employeeName+"\n");
                }
                        bw.close();
                        osw.close();
                        fos.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListOfEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    public void outputPartTimeEmployeeList(){
        for(Part_timeEmployee a:peList){
            System.out.println("ID: "+a.employeeID);
            System.out.println("Name: "+a.employeeName);
            System.out.println("WorkDay: "+a.getWorkday());
            System.out.println("HourLate: "+a.getNumberOfHourLate());
        }
    }
}
