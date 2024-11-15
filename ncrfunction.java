import java.util.Scanner;
public class ncrfunction{
public static int fact(int n){
    int fact = 1;
    for (int i = 2; i<=n; i++){
        fact = fact * i;
    }
    return fact;
}
public static int ncr(int n, int r){
    int num = fact(n);
    int denom = fact(r) * fact(n-r);
    int ans = num/denom;
    return ans;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int answer = ncr(n, r);
        System.out.println(answer);
    }
}