/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Nimantha
 */
public class Messages {

    public static void datasaved() {

        JOptionPane.showMessageDialog(null, "Data Saved!");

    }

    public static void dataupdated() {

        JOptionPane.showMessageDialog(null, "Data Updated!");

    }
     public static void fillemptydata() {

        JOptionPane.showMessageDialog(null, "Please Fill Empty Data Feilds !", "Error", 2, null);

    }

    public static void normaljoption(String error1) {

        JOptionPane.showMessageDialog(null, error1);

    }

    public static void errorjoption(String error1) {
        JOptionPane.showMessageDialog(null, error1, "Error", 0, null);

    }

    public static void warningjoption(String error1) {
        JOptionPane.showMessageDialog(null, error1, "Error", 2, null);

    }

    public static void questionjoption(String error1) {
        JOptionPane.showMessageDialog(null, error1, "Error", 3, null);

    }

    void questionjoption(String string, JTextField txtdirector1) {
        questionjoption(string);
        txtdirector1.requestFocus();
    }
}
