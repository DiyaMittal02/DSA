/*Here we will have to find the second largest and second smallest element in array
for finding the same we will first find the smallest and largest element in array, then will traverse in array again and then will compare*/
/*MATH.min and Math.max to find the smallest and largest element in array*/
import java.util.Scanner;
public class largestsmallest{
    public static void main(String[] args){
        int arr[] = {2, 9, 1, 0, 8};
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        System.out.println(small);
        System.out.println(large);
    for (int i = 0; i<arr.length; i++){
        if (arr[i] < second_small && arr[i] != small){
            second_small = arr[i];
        }
        if (arr[i] > second_large && arr[i] != large){
            second_large = arr[i];
        }
    }
    System.out.println(second_large);
    System.out.println(second_small);
    }
}