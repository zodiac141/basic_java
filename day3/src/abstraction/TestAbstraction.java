package abstraction;

abstract class TestA{
    protected int x;
    protected int y;
    protected TestA(int x , int y){
        this.x=x;
        this.y=y;
    }
    void output(){
        System.out.println("x="+x+" y="+y);
    }
    abstract void add();
}


public class TestAbstraction extends TestA {

    public TestAbstraction(int x, int y) {
        super(x, y);
    }
    public static void main (String[]args){
        TestAbstraction test=new TestAbstraction(23,24);
        test.output();
        test.add();
    }

    @Override
    void add() {

       System.out.println("the sum is :"+ (x+y));
    }
}
