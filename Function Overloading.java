class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    String add(String a, String b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        System.out.println(math.add(5, 3));
        System.out.println(math.add(2.5, 3.7));
        System.out.println(math.add("Hello", " World"));
        System.out.println(math.add(1, 2, 3));
    }
}
