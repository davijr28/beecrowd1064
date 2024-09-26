
import java.util.Scanner;

public class Beecrowd1064 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        //declarar variáveis
        // Declarar variáveis
        float valores[] = new float[6];
        int positivos = 0;
        float media = 0;

        // Ler os valores
        for (int i = 0; i < 6; i++) {
            String input = scanner.nextLine(); // Ler como String
            try {
                // Tentar converter para int primeiro
                int valorInt = Integer.parseInt(input);
                valores[i] = valorInt; // Se for int, atribui a float
            } catch (NumberFormatException e1) {
                float valorFloat = Float.parseFloat(input);
                valores[i] = valorFloat; // Atribui a float

            }
            if (valores[i] > 0) {
                positivos++;
                media += valores[i];
            }
        }
        //calcular a média
        media /= positivos;
        //mostrar o resultado no console
        System.out.printf("%d valores positivos%n%.1f%n", positivos, media);
    }
}
