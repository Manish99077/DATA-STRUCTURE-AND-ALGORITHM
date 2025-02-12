package array;
import java.util.*;
public class removeduplicates {
    public static void removedup(int numbers[]) {
     java.util.Arrays.sort(numbers);
        int newarr[] = new int[numbers.length];
        int index = 0; 
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0 || numbers[i] != numbers[i - 1]) { 
                newarr[index] = numbers[i];
                index=index+1;
            }
        }   
        System.out.println("Array without duplicates:");
        for (int i = 0; i < index; i++) {
            System.out.print(newarr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int numbers[] = {1, 1, 2, 2, 3, 3, 4};
        removedup(numbers);
    }
}

