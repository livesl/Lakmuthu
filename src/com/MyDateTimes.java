/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lasitha Ranawaka
 */
public class MyDateTimes {
    
    public static String   currentdate1;

    public static String TodayDate() {
        Date datenow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");

        return sdf.format(datenow);
    }
    
    public static String TodayTimeNow() {
        Date datenow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

        return sdf.format(datenow);
    }
    
     public static String TodayDateTimeNow() {
        Date datenow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        return sdf.format(datenow);
    }
    
     public static Date DateSet(Date d){
    
        d.setDate(d.getDate()+7);
    
        return d;
    }
    
}
