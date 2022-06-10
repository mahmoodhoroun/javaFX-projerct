
package code;


//Employee id, Employee Address,
//Employee phone number , Employee Email, Employee
//basicSalary, Employee liveExpensive ,Employee Password
public   class  Employee {
     private String Employee_name ;
     private String Employee_id ;
     private String Employee_Address;
     private String Employee_phone_number;
     private String Employee_Email;
     private double Employee_basicSalary;
     private double liveExpensive ;
     private String Employee_Password;
     
    public Employee(String Employee_name ,String Employee_id, String Employee_Address, String Employee_phone_number, String Employee_Email, double Employee_basicSalary , String Employee_Password) {
        this.Employee_name=Employee_name;
        this.Employee_id = Employee_id;
        this.Employee_Address = Employee_Address;
        this.Employee_phone_number = Employee_phone_number;
        this.Employee_Email = Employee_Email;
        this.Employee_basicSalary = Employee_basicSalary;
        this.liveExpensive = 0.1 * Employee_basicSalary;
        this.Employee_Password = Employee_Password;
    }

    public Employee() {
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String Employee_name) {
        this.Employee_name = Employee_name;
    }

    public String getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(String Employee_id) {
        this.Employee_id = Employee_id;
    }

    public String getEmployee_Address() {
        return Employee_Address;
    }

    public void setEmployee_Address(String Employee_Address) {
        this.Employee_Address = Employee_Address;
    }

    public String getEmployee_phone_number() {
        return Employee_phone_number;
    }

    public void setEmployee_phone_number(String Employee_phone_number) {
        this.Employee_phone_number = Employee_phone_number;
    }

    public String getEmployee_Email() {
        return Employee_Email;
    }

    public void setEmployee_Email(String Employee_Email) {
        this.Employee_Email = Employee_Email;
    }

    public double getEmployee_basicSalary() {
        return Employee_basicSalary;
    }

    public void setEmployee_basicSalary(double Employee_basicSalary) {
        this.Employee_basicSalary = Employee_basicSalary;
    }

    public double getLiveExpensive() {
        return 0.1*this.Employee_basicSalary;
    }

   

    public String getEmployee_Password() {
        return Employee_Password;
    }

    public void setEmployee_Password(String Employee_Password) {
        this.Employee_Password = Employee_Password;
    }

    @Override
    public String toString() {
        return  "Employee_name=" + Employee_name +", Employee_id=" + Employee_id +", Employee_Password=" + Employee_Password +", Employee_phone_number=" + Employee_phone_number + ", Employee_Email=" + Employee_Email  +", Employee_Address=" + Employee_Address +  ", Employee_basicSalary=" + Employee_basicSalary + ", liveExpensive=" + liveExpensive ;
    }
     
     
     
     
}
