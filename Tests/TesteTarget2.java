import java.util.Scanner;

public class TesteTarget2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        if(Fibonacci(num))
            System.out.println("O número: "+ num +" pertence a sequencia de fibonacci");
        else
            System.out.println("O número: " + " Não pertence a sequencia de fibonacci");
     scanner.close();
    }
    public static boolean Fibonacci(int n){
        if ( n == 0 || n == 1)
            return true;
        int a =0;
        int b= 1;
        int c = a + b;

        while(c <= n){
            if(c == n){
                return true;
            }
            a=b;
            b=c;
            c =a+b;
        }
        return false;
    }
}
