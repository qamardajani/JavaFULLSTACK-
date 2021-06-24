public class FizzBuzz {
    
    public void fizzBuzz(int number) {
        // fizzbuzz logic here
        if ( number % 5 == 0 && number % 3 == 0 )
        System.out.println(number +" FizzBuzz");
        
        
       else  if ( number % 3 == 0 )
        System.out.println(number +" Fizz");
        
       else if ( number % 5 == 0 )
         System.out.println(number +" Buzz ");
        
    
        else 
            System.out.println(number);
        }
       
    }