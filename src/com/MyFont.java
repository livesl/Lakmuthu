/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.UIManager;

/**
 *
 * @author Developer
 */
public class MyFont {

    public static void setUIFont(javax.swing.plaf.FontUIResource f) {

        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }
    
    
    List<String> li = new ArrayList<>();

    public void AddSinhalaFonts() {

        li.add("_KALAHAM.TTF");
        li.add("_kushpoo.ttf");
        li.add("FM_ABHAY.TTF");
        li.add("FM_Bindumathi.TTF");
    }

   

    public boolean CheckFonts() {

        boolean bol = false;

        try {
            File f = new File("C:\\Windows\\Fonts");

            String s[] = f.list();

            for (String string : li) {

                if (new File("C:\\Windows\\Fonts\\"+string).exists()) {
                    bol=false;
                }else{
                    com.Messages.errorjoption("Missing font - "+string);
                    System.out.println("Miss font - "+string);
                    bol=true;
                    break;
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }

       
        return bol;
    }
    
    
     public static String SinhalaInputDot2Mysql(String urtext){
    
        String r="";
        
        try {
           r=urtext.replaceAll("'","G1" );
        } catch (Exception e) {
            System.out.println(" Error in charactor Dot");
        }
         return  r;
    }
    
    public static String SinhalaGetDotfromMysql(String Dbtext){
    
        String rr="";
        
        try {
             rr=Dbtext.replaceAll("G1","'" );
        } catch (Exception e) {
           System.out.println(" Error in charactor Dot");
        }
        return rr;
    }
    
}
