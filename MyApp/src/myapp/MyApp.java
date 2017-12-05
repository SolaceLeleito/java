/*
 * To change this license header, choose License Headers in Project Properties.A
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.util.Scanner;

/**
 *
 * @author Raymond Oniel's
 */
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Reply with");
        System.out.println("A:to add anew record");
        System.out.println("D:delete/remove");
        System.out.println("U:to update a record");
        String reply;
        Scanner scanner = new Scanner(System.in);
        reply=scanner.nextLine();
        switch(reply){
            case"A":
                int Stud_id;
                String first_name,last_name,gender,Degree_programme; 
                      System.out.println("Your student number");
                      Stud_id=scanner.nextInt();
                            System.out.println("Your f name");
                            first_name=scanner.nextLine();
                            System.out.println("Your l name");
                            last_name=scanner.nextLine();
                            System.out.println("Your gender");
                            gender=scanner.nextLine();
                            System.out.println("Your Degree_programme");
                            Degree_programme=scanner.nextLine();
                            Crudoperations crudoperations = new Crudoperations();
                            crudoperations.setStudent_no(Stud_id);
                            crudoperations.setFirst_name(first_name);
                            crudoperations.setLast_name(last_name);
                             crudoperations.setGender(gender);
                              crudoperations.setProgramme(Degree_programme);
                            crudoperations.save();
                                    
                break;
                case"D":
                    
                    break;
                case"U":
                    
                    break;
                default:
                    System.out.println("Invalid Entry");
                    
        }
    }
    
}
