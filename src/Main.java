
import controller.ProgramCheckData;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        String title= "====== Validate Progaram ======";
        String[] s= new String[] {"Check Phone Number", "Check Email", "Check Date"};
        new ProgramCheckData(title, s).run();
    }
}
