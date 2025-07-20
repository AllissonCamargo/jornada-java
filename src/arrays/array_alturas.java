package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Array_Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];
        int pessoasComMenosDe16Anos = 0;
        double porcentagemMenor16Anos;
        double alturaTotal = 0.0;

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }


        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16){
                pessoasComMenosDe16Anos++;
            }
        }

        for (int i = 0; i < alturas.length; i++) {
            alturaTotal += alturas[i];
        }
        double alturaMedia = 0;
        alturaMedia = alturaTotal / alturas.length;

        porcentagemMenor16Anos = ((double) pessoasComMenosDe16Anos / idades.length) * 100;

        System.out.printf("Altura média: %.2f", alturaMedia);
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %.2f%n", porcentagemMenor16Anos, "%");
        for (int i = 0; i < idades.length; i++){
            if (idades[i] < 16 ){
                System.out.println(nomes[i]);
            }
        }












        sc.close();
    }
}
