import java.util.*;
public class Main {
public static int linearSearch(int[] list, int key) {
    
    for (int i= 0; i < list.length; i++) {
        if (key == list[i]) 
       return i; 
    }
    return -1;
}

public static void main(String[]  args) {
    int[] numbers = {1, 3, 5, 7, 9};
    int key = 7;
    int result = linearSearch(numbers, key);
    
    if (result == -1) {
        
        System.out.println("Key not found in the array. ");
    } else 
        System.out.println("Key found at the array: "  + result);
    }
}
