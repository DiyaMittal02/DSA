import java.util.Scanner;
public class powerfunction{
public static int power(int n, int b){
    int ans = 1;
    for (int i = 1; i<= b; i++){
        ans = ans * n;
    }
    return ans;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter power");
        int b = sc.nextInt();
        int answer = power(n, b);
System.out.println(answer);
    }
}