/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sudaraka
 */
public class NIC {
    String yar = "";

    public String BirthDatefromNIC(String nic) {

        String read = "";

//        if (nic.length() != 10) {
//            read = "Invalied NIC Number Detected";
//        } else {

            yar = "19" + nic.substring(0, 2); // only for yr 2000 above
            String month = "01";
            String day = nic.substring(2, 5);

            if (day.substring(0, 1).equals("0")) {
                day = nic.substring(3, 5);
            }
            int num = Integer.parseInt(day);


            if (num > 366 && num < 500) {
                num = num - 366;
            } else if (num >= 500 && num <= 866) {
                num = num - 500;
            } else if (num > 866 && num <= 999) {
                num = num - 866;
            }

            read = DateCal(yar + "-" + month + "-" + "00", num);

       // }

        return read;
    }

    private String DateCal(String date, int count) {

        String day = "";

        if (yar.equals("")) {

            day = "Invalied Year Call";

        } else {

            Date d = new Date();
            try {
                d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (ParseException ex) {
                System.out.println(ex + "   Exepception from Simpledatefrmat to Date");
            }

            if (checkLongYear(yar)) {
                d.setDate(d.getDate() + count);
            } else {
                if (count >= 61) {
                    d.setDate(d.getDate() + count - 1);
                } else {
                    d.setDate(d.getDate() + count);
                }

            }

            day = new SimpleDateFormat("yyyy-MM-dd").format(d).toString();


        }


        return day;
    }

    private boolean checkLongYear(String yr) {

        boolean bol = false;
        int y = Integer.parseInt(yr);

        if (y % 4 == 0 || y % 100 == 0) {
            bol = true;
        }

        return bol;
    }

   
//    public static void main(String[] args) {
//        
//        System.out.println(new NIC().BirthDatefromNIC("900521782v"));
//    }
}
