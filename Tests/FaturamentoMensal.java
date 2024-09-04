/*import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

class Faturamento {
    int dia;
    double valor;
}

public class FaturamentoMensal {

    public static void main(String[] args) {
        try {
            // Ler os dados do arquivo JSON
            Gson gson = new Gson();
            Type faturamentoListType = new TypeToken<List<Faturamento>>() {}.getType();
            FileReader reader = new FileReader("faturamento.json");
            List<Faturamento> faturamentoMensal = gson.fromJson(reader, faturamentoListType);
            reader.close();

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0.0;
            int diasComFaturamento = 0;

            // Calcular menor e maior faturamento e somar os valores para cálculo da média
            for (Faturamento faturamento : faturamentoMensal) {
                if (faturamento.valor > 0) {
                    if (faturamento.valor < menorFaturamento) {
                        menorFaturamento = faturamento.valor;
                    }
                    if (faturamento.valor > maiorFaturamento) {
                        maiorFaturamento = faturamento.valor;
                    }
                    somaFaturamento += faturamento.valor;
                    diasComFaturamento++;
                }
            }

            double mediaMensal = somaFaturamento / diasComFaturamento;
            int diasAcimaDaMedia = 0;

            // Contar o número de dias com faturamento superior à média
            for (Faturamento faturamento : faturamentoMensal) {
                if (faturamento.valor > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor faturamento do mês: R$ " + menorFaturamento);
            System.out.println("Maior faturamento do mês: R$ " + maiorFaturamento);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
*/