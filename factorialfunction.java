import java.util.Scanner;
public class factorialfunction{
    public static int factorial(int n){
        int ans = 1;
        for (int i = 1; i<=n; i++){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = factorial(n);
        System.out.println(answer);
    }
}