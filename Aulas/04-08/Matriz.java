import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args) {
        double[][] matriz = new double[3][3];
        double[] media = new double[3];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 3 ; j++){
                if (j < 2) {
                    System.out.print("Entre com a sua Nota da AV" + j+1 + ": ");
                    matriz[i][j] = teclado.nextDouble();
                } else {
                    matriz[i][j] = Math.round(matriz.length / j);
                }

            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", (int) matriz[i][j]);

            }
            System.out.println();
        }

        double soma = 0;
        for (int i = 0; i<3; i++) {
            for (int j = 0 ; j <3; j++) {
                soma += matriz[j][i];
                media[i] = Math.round(soma / matriz.length);
            }
            System.out.print("A média da AV" + (i + 1) + " é: " + media[i] + ". ");
            soma = 0;
        }
        System.out.println();
        teclado.close();

    }
}
