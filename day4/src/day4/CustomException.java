package day4;

public class CustomException {
    public static void main(String[] args) {
        int empcode=103;
        String empname="Ramesh";
        try{
            if(empcode!=123){
                throw new EmployeeNotFoundEXception();
            }
            else{
                System.out.println("Employee code is :"+empcode);
                System.out.println("Employee name is :"+empname);
            }
        }
        catch(EmployeeNotFoundEXception e){
            e.printStackTrace();
        }
    }
}
