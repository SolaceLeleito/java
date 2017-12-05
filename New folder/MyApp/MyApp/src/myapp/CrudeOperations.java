package myapp;


import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 88072
 */
public class CrudeOperations {
    private int student_no;
    private String first_name;
    private String last_name;
    private String gender;
    private String programme;
    
//setters

    public void setStudent_no(int student_no) {
        this.student_no = student_no;
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

    public void setProgramme(String programme) {
        this.programme = programme;
    }
//getters

    public int getStudent_no() {
        return student_no;
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
        return programme;
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
        Connection con = new DBConnector().connector();
        try{
        pst = con.prepareStatement("INSERT INTO student_details(student_id, first_name, last_name, gender, programme ) VALUES(?,?,?,?,?)");
            pst.setInt(1, getStudent_no());
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


