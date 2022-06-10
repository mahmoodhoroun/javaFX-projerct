package code;

import java.util.ArrayList;


public class Subject {
    
    private String Subject_Name;
        ArrayList<String> teacher = new ArrayList<>();
        ArrayList<String> student = new ArrayList<>();

    public Subject(String Subject_Name ,ArrayList teacher , ArrayList student ) {
        this.Subject_Name = Subject_Name;
        this.teacher =teacher;
        this.student=student;
    }

    public Subject() {
    }

    public String getSubject_Name() {
        return Subject_Name;
    }

    public void setSubject_Name(String Subject_Name) {
        this.Subject_Name = Subject_Name;
    }

    public ArrayList<String> getTeacher() {
        return teacher;
    }

    public void setTeacher(ArrayList<String> teacher) {
        this.teacher = teacher;
    }

    public ArrayList<String> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<String> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return   "Subject_Name=" + Subject_Name + "\n The teacher name who teaches it =" + teacher 
                + "\n The students who study it =" + student +"\n====================================================" ;
    }
    
    
}
