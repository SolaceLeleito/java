/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author Raymond Oniel's
 */
public class Learning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        checkAge(12);
    }
    public static void checkAge (int age) {
        if (age<18){
            throw new ArithmeticException("you have not attained voting age");
        }
        else
        {
            System.out.println("you eligible to vote");
        }
    }
    
}
