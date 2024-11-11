import java.util.Scanner;
public class arrayadd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
             sum = arr[index1] + arr[index2] ;
            
        }
        System.out.println(sum);
        
    }
}