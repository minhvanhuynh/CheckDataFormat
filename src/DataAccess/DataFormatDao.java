/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import view.Validation;

/**
 *
 * @author This PC
 */
public class DataFormatDao {
    
    private static DataFormatDao instance= null;
    private Validation validation;
    
    public DataFormatDao(){
        validation= new Validation();
    }
    
    public static DataFormatDao Instance(){
        if(instance==null){
            synchronized (DataFormatDao.class) {
                if(instance==null){
                    instance= new DataFormatDao();
                }                
            }
        }
        return instance;
    }
    
    public void checkPhone(){
        while (true) {
            try {
                System.out.print("Enter Phone number: ");
                String phone = validation.checkInputString();
                int check= Integer.parseInt(phone);             
                if (phone.matches("^[0]\\d{9}$")) {
                    System.out.println("Phone valid is: " + phone);
                } else {
                    System.err.println("Phone number must be 10 digits and Start 0");
                    continue;
                }
            } catch (Exception e) {
                System.err.println("Phone number must is number");
                continue;
            }
            System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
            if(!validation.checkInputYesNo()){
                return;
            }
        }
    }
    
    public void checkEmail(){
        while(true){
            System.out.print("Enter email: ");
            String email= validation.checkInputString();
            String format="^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
            if(email.matches(format)){
                System.out.println("Email valid is: "+email);
            }else{
                System.err.println("Email must is correct format");
                continue;
            }
            System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
            if(!validation.checkInputYesNo()){
                return;
            }
        }
    }
    
    public void checkDate(){
        while(true){
            try{
            System.out.print("Enter Date followed format(dd/mm/yyyy): ");
            String date= validation.checkInputString();
            LocalDate local= LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String[] check= date.split("/");
            int check_year= Integer.parseInt(check[2]);
            if(check_year<1990){
                System.err.println("Year must greater than 1990!");
                continue;
            }else{
                System.out.println("Date valid is: "+date);
            }
            }catch(Exception e){
                System.err.println("Date to correct format(dd/mm/yyyy)!");
                continue;
            }
            System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
            if(!validation.checkInputYesNo()){
                return;
            }
        }
    }
}
