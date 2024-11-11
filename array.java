import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to store in an array: ");
        int n = sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter elements: ");
        for (int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        System.out.println(array[i]);
        }
        }
    }
