import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
      
       System.out.println("Enter the First integer");
       Scanner input=new Scanner(System.in);
       int a =input.nextInt();
       
       
       System.out.println("Enter the Second integer");
       
       int b =input.nextInt();
       
        if (a > b)
        {
        System.out.println("a is greater than b");

        }
    else if (a < b)
        {
        System.out.println("b is greater than a");
        }
    else {
        System.out.println("a is equal to b");
    }

  }
    
}
