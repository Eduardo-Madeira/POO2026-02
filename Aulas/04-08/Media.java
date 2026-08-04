import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        double nota1, nota2, media;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = teclado.nextDouble();

        media = (nota1 + nota2) / 2;
        double mediaArredondada = Math.round(media);

        if (mediaArredondada >= 6) {
            System.out.println("A média é: " + mediaArredondada);
            System.out.println("Aprovado");
        } else {
            System.out.println("A média é: " + mediaArredondada);
            System.out.println("Reprovado");
        }
        teclado.close();
    }

}