import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava{//Q1
    public static ArrayList<Integer> greater(int [] array){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sum = 0;
        for (int i=0 ; i<array.length ; i++){
            sum = sum+array[i];

            if (array[i]>10){
                arr.add(array[i]);
            }
        }
        System.out.println("the sum  is: "+ sum);
        System.out.println(arr);
        return (arr);   

}
public static ArrayList<String> name (String [] x) {
	ArrayList<String> namee = new ArrayList<String>();
	ArrayList<String> greater5= new ArrayList<String>();
	 for ( int i=0; i<x.length;i++)
	 {
	 	if (x[i].length() > 5)
	 	{
	 		greater5.add(x[i]);
	 	}
	 	namee.add(x[i]);
	 }

	Collections.shuffle(namee);
        System.out.println(namee);
        System.out.println(greater5);
        return greater5;

}
 public static void alphabet(){
        ArrayList<Character> arr = new ArrayList<Character>();
        for (char i='A' ; i<= 'Z' ; i++){
            arr.add(i);
        }
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println("Last letter of shuffled array: " + arr.get(25));
        char firstLetter = arr.get(0);
        System.out.println("First letter of shuffled array: " + firstLetter);
        if ("AEIOU".indexOf(firstLetter) >= 0) 
        System.out.println("First letter is a vowel.");

}
public static int[] randomNums() {
        int[] newArr = new int[10];
        Random r = new Random();
        for (int i = 0; i < newArr.length; i++) {
          newArr[i] = r.nextInt(100-55) + 55;
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
      }
      public static void randomNumsSorted() {
        int[] newArr = randomNums();
        ArrayList<Integer> newArrList = new ArrayList<Integer>();
        for (int i = 0; i < newArr.length; i++) {
            newArrList.add(newArr[i]);
        }
        Collections.sort(newArrList);
        System.out.println(newArrList);
        System.out.println("Minimum value: " + newArrList.get(0));
        System.out.println("Maximum value: " + newArrList.get(9));
      }
        public static String randomString() {
        ArrayList<Character> newArr = new ArrayList<Character>();
        String newString = "";
        for (char letter = 'A'; letter <= 'Z'; letter++) {
          newArr.add(letter);
        }
        Collections.shuffle(newArr);
        for (int i = 0; i < 5; i++) {
          newString += newArr.get(i);
        }
        return newString;
      }
        public static void arrayOfRandomStrings() {
        String[] newArr = new String[10];
        for (int i = 0; i < 10; i++) {
          newArr[i] = randomString();
        }
        System.out.println(Arrays.toString(newArr));
      }

 public static void main(String[] args) {
       
        int[] ar ={3,5,1,2,7,9,8,13,25,32};
        greater(ar);
        String [] names ={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        name(names);
        alphabet();

        randomNums();

        randomNumsSorted();

        System.out.println("Random String: " + randomString());

        arrayOfRandomStrings();


    }
}

    


