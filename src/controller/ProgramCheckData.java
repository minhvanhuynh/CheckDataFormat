/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.DataFormatRepository;
import Repository.IDataFormatRepository;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ProgramCheckData extends Menu<String>{
    
    private IDataFormatRepository idf= new DataFormatRepository();
    
    public ProgramCheckData(String title, String[] s){
        super(title, s);
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                idf.checkPhone();
                break;
            case 2:
                idf.checkEmail();
                break;
            case 3:
                idf.checkDate();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    
}
