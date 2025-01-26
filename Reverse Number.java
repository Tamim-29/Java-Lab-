public class Main
{
   public static void main(String[] args)
   {
        int num = 121;
        int revNum = 0;  
        int remainder;   
        
       
        while (num != 0)  
        {
            remainder = num % 10;  
            revNum = revNum * 10 + remainder;  
            num /= 10;  
        }
        
        System.out.println("Reversed Number: " + revNum);  
   }
}
