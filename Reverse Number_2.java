import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
        
         
         System.out.println("Enter num");
       Scanner input = new Scanner(System.in);
      int num=input.nextInt();
      int revNum=0;
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
