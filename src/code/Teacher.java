
package code;

public class Teacher extends Employee {
    
    private int classcount;

    public Teacher() {
    }

    public Teacher(String Employee_name,int classcount, String Employee_id, String Employee_Address, String Employee_phone_number, String Employee_Email, double Employee_basicSalary, String Employee_Password) {
        super(Employee_name,Employee_id, Employee_Address, Employee_phone_number, Employee_Email, Employee_basicSalary, Employee_Password);
        this.classcount = classcount;
    }
    public Teacher( Teacher teacher) {
        super(  teacher.getEmployee_name() ,teacher.getEmployee_id(), teacher.getEmployee_Address(), teacher.getEmployee_phone_number(), teacher.getEmployee_Email(), teacher.getEmployee_basicSalary(),teacher.getEmployee_Password());
        this.classcount = teacher.classcount;
    }

    public int getClasscount() {
        return classcount;
    }

    public void setClasscount(int classcount) {
        this.classcount = classcount;
    }

    @Override
    public String toString() {
        return  "name="+getEmployee_name()+", id=" + this.getEmployee_id()  +", phone_number=" + this.getEmployee_phone_number()+ ", Total Salary="+this.getSalary()+ ", classcount=" + classcount  + ", Address=" + this.getEmployee_Address()
   + ", Email=" + this.getEmployee_Email() + ", basicSalary=" + this.getEmployee_basicSalary() + ", liveExpensive=" + this.getLiveExpensive() + ", Password=" + this.getEmployee_Password() ;
    }

    public double getSalary() {
     return this.getEmployee_basicSalary() + this.classcount*20 + this.getLiveExpensive();
    }

   
    
}
