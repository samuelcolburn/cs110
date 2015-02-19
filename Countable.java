public class Countable {
   
   //class variable
   private static int instanceCount = 0;
   
   //instance variable
   int num;
   
   public Countable(){
      instanceCount++;
      num =0;
   }
   
   public Countable(int n){
   
      num = n;
      instanceCount++;
   
   }
   
   
   public static int getCount(){
      
      return instanceCount;
   }
   

}