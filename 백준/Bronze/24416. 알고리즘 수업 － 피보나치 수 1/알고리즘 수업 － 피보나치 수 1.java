import java.util.*;

class Main {

    static int countFib = 0;
    static int countFibonacci = 0;
    static int[] f;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        fib(N);
        fibonacci(N);

        System.out.println(countFib + " " + countFibonacci);
    }

    public static int fib(int n){
        if (n == 1 || n == 2){
            countFib++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n){
        f = new int[n+1];
        f[0] = f[1] = 1;
        for(int i=3;i<=n;i++){
            f[i] = f[i - 1] + f[i - 2];
            countFibonacci++;
        }
        return f[n];
    }
}