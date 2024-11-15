import java.util.Scanner;
public class oddevenfunction{
public static int even(int a){
    if (a % 2 == 0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
    return a;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer = even(a);
        System.out.println(answer);
    }
}