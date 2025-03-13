package abstraction;

class Circle extends Shape{

    public Circle(double radius) {
        super(radius);
    }

    @Override
    void findArea() {
        System.out.println("area of circle  is :" + (pi*radius*radius));
    }
    public static void main (String[]args){
        Circle circle=new Circle(3.5);
        circle.findArea();
    }
}
