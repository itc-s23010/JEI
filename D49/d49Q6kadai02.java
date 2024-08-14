//s23010
//追加で中央値を求める

import java.util.Arrays;

public class d49Q6kadai02 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java d49Q6kadai02 <numbers>");
            return;
        }
        
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        
        double average = calculateAverage(numbers);
        
        int range = calculateRange(numbers);
        
        int greaterThanAverageCount = countGreaterThanAverage(numbers, average);
        int lessThanAverageCount = numbers.length - greaterThanAverageCount;
        
        Arrays.sort(numbers);
        
        double median = calculateMedian(numbers);
        
        System.out.printf("平均値:%.1f%n", average);
        System.out.println("値の範囲:" + range);
        System.out.printf("平均より大きい値の個数:%d 平均より小さい値の個数:%d%n", greaterThanAverageCount, lessThanAverageCount);
        System.out.printf("中央値：%d%n", (int) median);
    }
    
    private static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    
    private static int calculateRange(int[] numbers) {
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        return max - min;
    }
    
    private static int countGreaterThanAverage(int[] numbers, double average) {
        int count = 0;
        for (int num : numbers) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }
    
    private static double calculateMedian(int[] numbers) {
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 1) {
            return numbers[middle];
        } else {
            return (numbers[middle - 1] + numbers[middle]) / 2.0;
        }
    }
}
