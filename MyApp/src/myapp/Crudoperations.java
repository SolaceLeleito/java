/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.sql.*;

/**
 *
 * @author Raymond Oniel's
 */
class Crudoperations {
            private int Stud_id;
            private String first_name;
            private String last_name;
            private String gender;
            private String Degree_programme;
       
//setters

    public void setStudent_no(int Stud_id) {
        this.Stud_id = Stud_id;
    }
   

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setProgramme(String Degree_programme) {
        this.Degree_programme = Degree_programme;
    }
//getters

    public int getStud_id() {
        return Stud_id;
    }
    

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGender() {
        return gender;
    }

    public String getProgramme() {
        return Degree_programme;
    }
    //methods
    public int processGender(String g){
        if(g.equalsIgnoreCase("male")){
            return 1;
        }
        return 0;
    }
    public boolean save(){
        PreparedStatement pst = null;
        Connection con = new DBconnector().connector();
        try{
        pst = con.prepareStatement("INSERT INTO ics2101(Stud_id, first_name, last_name, gender, Degree_programme ) VALUES(?,?,?,?,?)");
            pst.setInt(1, getStud_id());
            pst.setString(2, getFirst_name());
            pst.setString(3, getLast_name());
            pst.setInt(4, processGender(getGender()));
            pst.setString(5, getProgramme());
            pst.execute();
            return true;
        }catch(SQLException ex){
            System.out.println("Error " + ex.getMessage());
            return false;
        }
    }
    public boolean removeRecord(){
        return true;
    }
    public boolean updateRecord(){
        return true;
    }

    
}

