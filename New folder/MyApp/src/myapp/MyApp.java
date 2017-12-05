/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.util.Scanner;
import myapp.CrudeOperations;

/**
 *
 * @author 88072
 */
public class MyApp {

  
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Reply with");
        System.out.println("A:To add a new record");
        System.out.println("D:To delete/remove a record");
        System.out.println("U: To update a record");
        String reply;
        Scanner scanner = new Scanner(System.in);
        reply = scanner.nextLine();
        switch(reply){
            case "A":
                int student_no;
                String first_name, last_name, gender, programme;
               System.out.println("Your student number"); 
               student_no = scanner.nextInt();
               System.out.println("Your f number"); 
               first_name = scanner.nextLine();
               System.out.println("Your l name"); 
               last_name = scanner.nextLine();
               System.out.println("Your gender"); 
               gender = scanner.nextLine();
               System.out.println("Your programme"); 
              programme = scanner.nextLine();
              CrudeOperations crudeOperations = new CrudeOperations();
              crudeOperations.setStudent_no(student_no);
              crudeOperations.setFirst_name(first_name);
              crudeOperations.setLast_name(last_name);
              crudeOperations.setGender(gender);
              crudeOperations.setProgramme(programme);
              crudeOperations.save();
               
                break;
            case "D":
                
                break;
            case "u":
                
                break;
                default:
                    System.out.println("Invalid entry");
                
        }
           
    }
    
}
