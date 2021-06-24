public class StringManipulator{
public  String trimAndConcat(String word1,String word2) {
return word1.trim()+word2.trim();

}
public static Integer getIndexOrNull(String text, char letter){
return text.indexOf(letter);

}
public static Integer getIndexOrNull(String text, String letter){
return text.indexOf(letter);
}
public static String concatSubstring(String text ,int num1,int num2, String letter){
String output = text.substring(num1,num2);
return output+letter ;
}




 public static void main(String[] args) {
StringManipulator manipulator = new StringManipulator();
String str = manipulator.trimAndConcat("    Hello     ","     World    ");
System.out.println(str); // HelloWorld 


StringManipulator semanipulator = new StringManipulator();
char letter = 'o';
Integer a = semanipulator.getIndexOrNull("Coding", letter);
Integer b = semanipulator.getIndexOrNull("Hello World", letter);
Integer c = semanipulator.getIndexOrNull("Hi", letter);
System.out.println(a); // 1
System.out.println(b); // 4
System.out.println(c); // null


StringManipulator thmanipulator = new StringManipulator();
String word = "Hello";
String subString = "llo";
String notSubString = "world";
Integer d = thmanipulator.getIndexOrNull(word, subString);
Integer e = thmanipulator.getIndexOrNull(word, notSubString);
System.out.println(d); // 2
System.out.println(e); // null



StringManipulator fomanipulator = new StringManipulator();
String word2 = fomanipulator.concatSubstring("Hello", 1, 2, "world");
System.out.println(word2); // eworld



}
}