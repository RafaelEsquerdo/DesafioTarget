public class TesteTarget1 {
    public static void main(String[] args) {
        int Indice = 13;
        int soma = 0;
        int K = 0;
        do{
            K = K+1;
            soma = soma + K;
        }while(K < Indice);

        System.out.println(soma);

    }
}
