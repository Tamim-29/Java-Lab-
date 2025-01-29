public class Main {
    public static void main(String[] args) {
        int n = 15;
        int first = 0, second = 1;
        
        System.out.println("fibonacci number up to 15 ");


        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
        
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
