public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeDetails emp1=new EmployeeDetails("Faraan",1234,50000,7695019037L);
        EmployeeDetails emp2=new EmployeeDetails("Hashmi",1235,50000,8695019037L);
        System.out.println("Name :"+emp1.getEmployeename());
        System.out.println("id :"+emp1.getEmployeeid());
        System.out.println("Salary :"+emp1.getSalary());
        System.out.println("Phone Number :"+emp1.getPhonenumber());
    }
}
