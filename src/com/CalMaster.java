/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Ranawaka
 */
public class CalMaster {

    public static Double DiscountPrecent(double precent, double price) {

        double tot = ((100 - precent) / 100) * price;


        return tot;// return price not %
     }
    
   
    
    
}
