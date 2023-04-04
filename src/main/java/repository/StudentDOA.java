package repository;
import java.util.Scanner;
import com.training.util.DBCon;
import entities.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDOA
{
    Scanner sc = new Scanner(System.in);

    public ArrayList<Student> getAll()
    {
        ArrayList<Student> slist = new ArrayList<Student>();
        ResultSet s;
        Student s1;
        try{

            Statement st = DBCon.con.createStatement();
            s = st.executeQuery("select * from students");
            while(s.next())
            {
                int rollno = s.getInt(1);
                String name = s.getString(2);
                String Email=s.getString(3);
                String Phone=s.getString(4);
                s1 = new Student();
                s1.setRollno(rollno);
                s1.setName(name);
                s1.setEmail(Email);
                s1.setPhone(Phone);

                slist.add(s1);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return slist;

    }
    public ArrayList<Student> getAllById()
    {
        System.out.println("to get student data by id");
        System.out.println("enter id");
        int id =sc.nextInt();

        ArrayList<Student> slist = new ArrayList<Student>();
        ResultSet s;
        Student s1;
        try{

            Statement st = DBCon.con.createStatement();
            s = st.executeQuery("select * from students where rollno="+id);
            while(s.next())
            {
               s1= new Student();
               int rollno=s.getInt(1);
               String name=s.getString(2);
                String Email=s.getString(3);
                String Phone=s.getString(4);
                s1.setRollno(rollno);
                s1.setName(name);
                s1.setEmail(Email);
                s1.setPhone(Phone);
                s1.add(slist);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return slist;

    }

}
