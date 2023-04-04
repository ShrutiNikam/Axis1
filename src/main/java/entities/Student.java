package entities;

import java.util.ArrayList;

public class Student
{
    int rollno;
    String name;
    String Email;

    String Phone;

    public Student(int rollno, String name, String Email, String Phone) {
        this.rollno = rollno;
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
    }

    public Student()
    {
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }

    public void add(ArrayList<Student> slist)
    {

    }
}
