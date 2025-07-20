package arrays.pensionato;

import java.util.Locale;
import java.util.Scanner;
public class Array_Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rentered? ");
        int totalQuartosAlugados = sc.nextInt();
        int totalQuartos = 10;



        Rent[] quartos = new Rent[totalQuartos];
        for (int i = 0; i < totalQuartosAlugados; i++){
            System.out.print("Rent #" + (i + 1) + ":\n");
            sc.nextLine();
            System.out.print("nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int quartoEscolhido = sc.nextInt();
            quartos[quartoEscolhido] = new Rent(nome, email, quartoEscolhido);
        }

        System.out.println("Busy rooms");
        for (Rent quarto : quartos) {
            if (quarto != null){
                System.out.println(quarto);
            }

        }

        sc.close();
    }
}
