/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class mainnn {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Date dateobj = new Date("11/03/20");
       System.out.println(df.format(dateobj));
    }
}
