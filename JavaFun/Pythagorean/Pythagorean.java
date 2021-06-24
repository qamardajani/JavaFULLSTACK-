public class Pythagorean {
   public static double calculateHypotenuse(int legA, int legB) {
   double legC;  
  legC=Math.sqrt(Math.pow(legA,2)+Math.pow(legB,2));
  return legC;
    }

    public static void main(String[] args) {
    
 System.out.println(calculateHypotenuse(4,4));

}

}
