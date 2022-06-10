
package code;


public class Student {
   private String id;
   private String name;
   private int level;

    public Student() {
    }

    public Student(String id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }
    
    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.level = student.level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return  " name=" +this.name+ ", id=" + this.id +", level=" + this.level ;
    }
   
  
    }
 
 
