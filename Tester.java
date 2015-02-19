public class Tester {

   public static void main(String [] args) {
   
      System.out.println(Countable.getCount());
   
      Countable cl = new Countable();
      Countable c1 = new Countable(4);
      
      System.out.println(c1.getCount());
   
   }






}