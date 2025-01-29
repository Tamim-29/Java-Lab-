import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int largest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3 ? num2 : num3);
        
         System.out.println("The largest number is: " + largest);
         
         scanner.close();
        
    }
}
