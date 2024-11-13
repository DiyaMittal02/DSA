/*here we have to check if the provided array is sorted or not
for finding the element is sorted or not, we can say that if the element is sorted then the previous element will be smaller or equal to current elemenet */

import java.util.Scanner;
public class arraysortcheck{
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 1 ; i<arr.length; i++){
            if (arr[i] < arr[i - 1]){
                System.out.println("not sorted");
            }
            else{
                System.out.println("sorted");
            }
        }
    }
}