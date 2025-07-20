package arrays;

public class For_Each {
    public static void main(String[] args) {


        // sintaxe
//      for (Tipo nomeDaVariavel : ListaOuArray){
//           códiigo aqui
//       }

        String[] array = new String[] {"Maria", "Bob", "Alex"};



        // Formas de iterar sobre uma array ou list

        // primeira for: Utilizando um laço for padrão
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]); // "Maria", "Bob", "Alex"
        }

        // Segunda forma: Utilizando o laço for_each
        for (String nome : array){
            System.out.println(nome); // "Maria", "Bob", "Alex"
        }


    }
}
