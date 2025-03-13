package day3;

    public class ClassTwo extends ClassOne {
        public void display() {
            System.out.println("Sub Class Hello");
        }

        public void show(){
            System.out.println("Sub Class Show");
        }

        public static void main(String[] args) {
       ClassTwo two = new ClassTwo();
        two.display();
       two.show();

    //        ClassOne one = new ClassOne();
     //       one.display();
     //       one.show();

            System.out.println("Upcasting");
            //Upcasting
            ClassOne one1 = new ClassTwo();
            one1.display();
     //       one1.show();


        }
    }

