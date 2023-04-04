package org.example;
import com.training.util.DBCon;
import repository.StudentDOA;



import java.sql.*;


public class Main{
    public static void main(String[] args) throws SQLException
    {
        System.out.println("Hello world!");
        DBCon.getConnection();
        StudentDOA dao = new StudentDOA();
        System.out.println(dao.getAll());
    }


}