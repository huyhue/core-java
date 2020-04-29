/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session8;

/**
 *
 * @author ASUS
 */
public class Example1 {
    void productCheck(int weight) throws InvalidProductException{
        if(weight < 100){
            throw new InvalidProductException("Product invalid");
        }
    }
    public static void main(String[] args) {
        Example1 obj = new Example1();
        try {
            obj.productCheck(60);
        } catch (InvalidProductException e) {
            System.out.println("Caught the error");
            System.out.println(e.getMessage());
        }
    }
}
