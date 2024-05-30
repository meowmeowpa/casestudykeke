package AdamEva;

public class Apple {
    private int weight=10;

   public  Apple(){

   }
   public void  decrease(){
       weight--;
   }
   public boolean isEmpty(){//check quả táo còn hay hêt
       if (getWeight()==0){
           return true;
       }
       return false;
   }
   public int getWeight(){
       return weight;
   }

}
