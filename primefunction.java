import java.util.Scanner;
public class primefunction{
    public static boolean prime(int n){
        for (int i = 2; i<n; i++){
            if (n % i == 0){
                return false;
                
            }

        }
        return true;
            }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (prime(n)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}