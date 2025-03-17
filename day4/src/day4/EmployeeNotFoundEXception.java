package day4;

public class EmployeeNotFoundEXception extends RuntimeException{
    public EmployeeNotFoundEXception(){
        super("Employee not found");
    }
}
