import java.util.*;

public class maxSubArraySumBruteForce1 {
    public static void maxsubarraybruteforce(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum = currentsum + numbers[k];
                    if (currentsum > maxsum) {
                        maxsum = currentsum;
                    }

                }
            }

        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxsubarraybruteforce(numbers);

    }
}
