/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datientrinh;
public class ThreadStateDemo extends Thread{
    static Thread th;
    public static void main(String[] args) {
        th = new ThreadStateDemo();
        System.out.println("Thread th is born");
        System.out.println("Thread th is ready");
        th.start();
    }
    public void run(){
        System.out.println("Thread th is running");
    }
}
