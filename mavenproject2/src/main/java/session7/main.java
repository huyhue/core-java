/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user role: ");
        String role = sc.nextLine();
        System.out.println("Enter user passwprd: ");
        String password = sc.nextLine();
        Password p = new Password(password, role);
        while(!p.isValidPassword()){
            System.out.println("Please enter a valid password: ");
            p.setPassword(sc.nextLine());
            
        }
        System.out.println("Thanks you, info of your account ");
        System.out.println("User role: "+p.getRole());
        System.out.println("User password: "+p.getPassword());
        System.out.println("Password code: "+p.getPasswordCode());
    }
}
