package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class School {

    public static void Add_teacher(String name, String classcount, String id, String Address, String phone_number, String Email, String basicSalary, String Password) throws FileNotFoundException {
        Teacher teacher = new Teacher();
        teacher.setEmployee_name(name);
        teacher.setEmployee_id(id);
        teacher.setEmployee_Address(Address);
        teacher.setEmployee_phone_number(phone_number);
        teacher.setEmployee_Email(Email);
        teacher.setEmployee_basicSalary(Double.parseDouble(basicSalary));
        teacher.setEmployee_Password(Password);
        teacher.setClasscount(Integer.parseInt(classcount));
        file.write_tesh(teacher.toString());
    }

    public static void signUp_Employee(String name, String id, String Address, String phone_number, String Email, String basicSalary, String Password) throws FileNotFoundException {
        Employee employee = new Employee();
        employee.setEmployee_name(name);
        employee.setEmployee_id(id);
        employee.setEmployee_Address(Address);
        employee.setEmployee_phone_number(phone_number);
        employee.setEmployee_Email(Email);
        employee.setEmployee_basicSalary(Double.parseDouble(basicSalary));
        employee.setEmployee_Password(Password);
        file.write_Employee(employee.toString());
    }

    public static void Add_mameger(String name, String MangerBonus, String id, String Address, String phone_number, String Email, String basicSalary, String Password) throws FileNotFoundException {

        Manger maneger = new Manger();
        maneger.setEmployee_name(name);
        maneger.setEmployee_id(id);
        maneger.setEmployee_Address(Address);
        maneger.setEmployee_phone_number(phone_number);
        maneger.setEmployee_Email(Email);
        maneger.setEmployee_basicSalary(Double.parseDouble(basicSalary));
        maneger.setEmployee_Password(Password);
        maneger.setMangerBonus(Double.parseDouble(MangerBonus));

        file.write_Maneger(maneger.toString());
    }

    

  
    public static void Add_teasher(String name, String classcount, String id, String Address, String phone_number, String Email, String basicSalary, String Password) throws FileNotFoundException {
        Teacher teacher = new Teacher();
        teacher.setEmployee_name(name);
        teacher.setEmployee_id(id);
        teacher.setClasscount(Integer.parseInt(id));
        teacher.setEmployee_Address(Address);
        teacher.setEmployee_phone_number(phone_number);
        teacher.setEmployee_Email(Email);
        teacher.setEmployee_basicSalary(Double.parseDouble(basicSalary));
        teacher.setEmployee_Password(Password);

        file.write_tesh(teacher.toString());
    }

    public static void Add_Student(String name, String id, String level) throws FileNotFoundException {
        Student student = new Student();
        student.setName(name);
        student.setId(id);
        student.setLevel(Integer.parseInt(level));
        file.write_stu(student.toString());

    }

    public static void Add_Subject(String name, ArrayList<String> s, ArrayList<String> t) throws FileNotFoundException {

        Subject subject = new Subject();

        subject.setSubject_Name(name);
        subject.setStudent(s);
        subject.setTeacher(t);

        file.write_sub(subject.toString());
    }

    public static void Show_Subjects() throws FileNotFoundException {
        System.out.println(file.read_sub());
    }

    
    

   
    public static void main(String[] args) throws FileNotFoundException {
      
    }

}
