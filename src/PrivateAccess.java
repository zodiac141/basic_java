class PrivateEx{
    private int secretcode=1235;
    void showcode(){
        System.out.println(secretcode);
    }
}



public class PrivateAccess {
    public static void main (String[] args){
        PrivateEx obj=new PrivateEx();
        obj.showcode();
    }
}

