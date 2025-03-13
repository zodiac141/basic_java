public class Examination extends Student{

        private int sub1;
        private int sub2;
        private int sub3;
        protected int total;
        protected double average;
        protected String result;

        public Examination(int rollNo, String name, String dept,int sub1, int sub2, int sub3) {
        super(rollNo, name, dept);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    void total() {
        total = sub1 + sub2 + sub3;
        average = total / 3;
            if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40 && average >= 40) {
                result = "pass";
                System.out.println("total marks: " + total);
                System.out.println("average marks: " + average);
                System.out.println(result);
            } else {
                result = "fail";
                System.out.println(result);
            }
        }
        public static void main (String[]args){
        Examination exam = new Examination(11, "Faraan", "ECE", 50, 60, 70);
        exam.display();
        exam.total();

    }
    }



