import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        // Criação do Scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.print("Digite a string que deseja inverter: ");
        String original = scanner.nextLine();

        // Variável para armazenar a string invertida
        String invertida = "";

        // Percorre a string original de trás para frente e constrói a string invertida
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);

        // Fecha o Scanner
        scanner.close();
    }
}
