public class CommandLineArguments {
    public static void main(String[] args) {
        int id=Integer.parseInt(args[0]);
        String name=args[1];
        double salary=Double.parseDouble(args[2]);
        long phonenumber=Long.parseLong(args[3]);
        System.out.println("Name :"+name + "id :"+id + "Salary :"+salary + "Phone Number :"+phonenumber);
    }
}
