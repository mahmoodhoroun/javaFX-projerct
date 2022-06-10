
package code;

public class Manger extends Employee {
    
      private double MangerBonus;

    public Manger() {
    }
    
    public Manger( String Employee_name,double MangerBonus, String Employee_id, String Employee_Address, String Employee_phone_number, String Employee_Email, double Employee_basicSalary , String Employee_Password) {
        super(Employee_name,Employee_id, Employee_Address, Employee_phone_number, Employee_Email, Employee_basicSalary, Employee_Password);
        this.MangerBonus = MangerBonus;
    }

    public double getMangerBonus() {
        return MangerBonus;
    }

    public void setMangerBonus(double MangerBonus) {
        this.MangerBonus = MangerBonus;
    }

    @Override
    public String toString() {
            return  "name="+getEmployee_name()+", id=" + this.getEmployee_id()  +", phone_number=" + this.getEmployee_phone_number()+ ", Total Salary="+this.getSalary() + ", Address=" + this.getEmployee_Address()
   + ", Email=" + this.getEmployee_Email() + ", basicSalary=" + this.getEmployee_basicSalary() + ", liveExpensive=" + this.getLiveExpensive() +", MangerBonus"+ MangerBonus+ ", Password=" + this.getEmployee_Password() ;
    }

    public  double  getSalary( ){
    
    return this.getEmployee_basicSalary() + this.getLiveExpensive() + this.getMangerBonus();
    }

     
}
