package day4;
  interface One {
    void methodone();

    }
    interface Two{
    void methodtwo();

  }
    interface Three extends One,Two{
      void methodthree();
    }
    interface Four extends One,Three{
      void methodfour();
    }
    interface Five extends Two,Three{
      void methodfive();
    }

  public class TestInterference implements One,Two,Three,Four,Five{
   public static void main(String[] args) {
       TestInterference test=new TestInterference();
       test.methodone();
       test.methodtwo();
       test.methodthree();
       test.methodfour();
       test.methodfive();
   }
    @Override
    public void methodone() {
       System.out.println("this is method one");
    }

    @Override
    public void methodtwo() {
     System.out.println("this is method two");

    }

      @Override
      public void methodfive() {
        System.out.println("this is method five");
      }

      @Override
      public void methodfour() {
       System.out.println("this is method four");
      }

      @Override
      public void methodthree() {
       System.out.println("this is method three");

      }
  }
