import java.util.Scanner;


public class App {
    
    static int fib(int n) {
        int f[] = new int[n +2];
        int i;

        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i -2];
        }

        return f[n];
    }
    
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter fibonacci sequence position: ");
        int N = scanner.nextInt();

        System.out.print("\nFibonacci number: "+fib(N)+"\n\n");

      scanner.close();
    }
}
