import java.util.Scanner;
public class elementinsert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4};
        int n = sc.nextInt();
        int newarr[] = new int[5];
        for (int i = 0; i<5; i++){
            newarr[i] = arr[i];
        }
        newarr[newarr.length - 1] = 5;
    }
}