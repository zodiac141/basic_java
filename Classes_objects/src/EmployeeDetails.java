public class EmployeeDetails {
    private String employeename;
    private int employeeid;
    private double salary;
    private  long phonenumber;

    public String getEmployeename() {
        return employeename;
    }

    public EmployeeDetails(String employeename, int employeeid, double salary, long phonenumber) {
        this.employeename = employeename;
        this.employeeid = employeeid;
        this.salary = salary;
        this.phonenumber = phonenumber;
    }

  public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
}
