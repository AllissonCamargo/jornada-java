package Lists;

import java.util.ArrayList;
import java.util.List;

public class Demonstration_list {
    public static void main(String[] args) { // Obs: Lists não aceitam tipos primitivos (por ex: List<int>). Tem que usar as Wrapper Class (List<Integer>)
        List<String> lista = new ArrayList<>();
        // adicionando elementos
        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");

        // iterando os nomes
        for (String nome : lista){
            System.out.println(nome);
        }
        System.out.println("____________________________________________________");


        System.out.println();
        System.out.println("adicionando elemento em uma posição específica");
        lista.add(2, "Marco");

        // iterando os nomes
        for (String nome : lista){
            System.out.println(nome);
        }

        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("removendo elemento");
        lista.remove("Anna"); // pode-se usar o index também

        // iterando os nomes
        for (String nome : lista){
            System.out.println(nome);
        }

        System.out.println("____________________________________________________");
        System.out.println("removendo usando um parametro/filtro (predicado ou func lambda)");

        //lista.removeIf(x -> x.charAt(0) == 'A');
        // pega o valor x e retorna true ou false se
        // x na posição 0 for == ao Char 'M'.

        // Também poderia ler algo como (remove x if x.charAt(index 0) == 'M')

        // OBS: para char, sempre utilizar aspas simples


        for (String nome : lista){
            System.out.println(nome);
        }

        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("encontrando a posição de um elemnto");
        System.out.println("Index of Bob: " + lista.indexOf("Bob"));
        System.out.println("Index of Marco: " + lista.indexOf("Marco")); // Não existe "Marco" na lista, por isso o retorno será -1
        System.out.println();
        System.out.println("____________________________________________________");

        // fazendo o inverso da remoção por filtro, deixando apenas os elementos que estiverem no filtro;
        System.out.println("fazendo o inverso da remoção por filtro, deixando apenas os elementos que estiverem no filtro");

        // lista.removeIf(x -> x.charAt(0) != 'M');
        for (String nome : lista){
            System.out.println(nome);
        }

        System.out.println("____________________________________________________");
        System.out.println("Gerando uma nova lista a partir da antiga com os elementos do filtro");

        List<String> novaLista = lista.stream().filter(x -> x.charAt(0) == 'A').toList();


        for (String nome : novaLista){
            System.out.println(nome);
        }
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("Encontrando um elemento da lista que atenda um parametro, por exemplo um elemento que comece com a letra A. Se não encontrar -> null");
        String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }


}
