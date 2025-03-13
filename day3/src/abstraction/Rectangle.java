package abstraction;
public class Rectangle extends Shape {

    public Rectangle(float length, float breadth) {
        super(length, breadth);
    }

    @Override
    void findArea() {
        System.out.println("area of rectangle is :" + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.findArea();
    }
}