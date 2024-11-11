import java.util.Scanner;
public class elementsearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int n = sc.nextInt();
        int arr[] = {1, 2, 4, 5, 8};
        
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == n){
                System.out.println("yes");
        }
    }
    
    }
}