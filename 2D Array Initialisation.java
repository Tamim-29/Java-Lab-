import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] value = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers for 3x3 array:");
        
        for(int i = 0; i < value.length; i++) {
            for(int j = 0; j < value[i].length; j++) {
                value[i][j] = input.nextInt();
            }
        }
        
        System.out.println("You Entered:");  
        for(int[] row : value) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
