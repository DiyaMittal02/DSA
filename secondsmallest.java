/*find the second smallest and second largest elemenet in an array 
We can first sort the given array
then accordingly second element in array would be the second smallest element and the second last element in an array would be second largest element


Here we have directly imported arrays using import java.util.Arrays
and then we can directly sort elements*/

import java.util.Scanner;
import java.util.Arrays;
public class secondsmallest{
    public static void main(String[] args){
        int arr[] = {2, 5, 1, 7};
        int n = arr.length;
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-2];
        System.out.println(small);
        System.out.println(large);
    }
}
