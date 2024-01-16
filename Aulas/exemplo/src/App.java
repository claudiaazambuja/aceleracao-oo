import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Imprime mensagem no console
        System.out.println("Oi genteee!");

        // Declaração de variável com os principais tipos
        String tituloReceita = "Bolo de Cenoura";
        int quantidadeIngredientes = 3;
        double precoVenda = 5.5;
        boolean vegetariana = false; // apenas true ou false, não faz coerção

        // Concatenação de Strings
        String nome = "Mara";
        String sobrenome = "Maravilha";
        String nomeAutora = nome + " " + sobrenome;
        System.out.println(nomeAutora);

        // Variável com valor que não muda (tipo const no JS)
        final String exemplo = "Eu não vou mudaaar";

        // Condicionais
        // Operador de igualdade é apenas 2 iguais
        // De resto, os operadores lógicos e aritmeticos são como no JS
        if (quantidadeIngredientes < 10 && !vegetariana) {
            System.out.println("Receita legal");
        } else {
            System.out.println("Receita difícil");
        }

        // Resto da divisão com o operador %
        int numero = 10;
        System.out.println(numero % 2 == 0);


        // Loop while: igual o JS, ão se esqueça de incrementar o seu contador
        int quantidadeReceitas = 4;
        while (quantidadeReceitas != 0) {
            System.out.println("Essa é a receita " + quantidadeReceitas);
            quantidadeReceitas = quantidadeReceitas - 1;
            // quantidadeReceitas -= 1;
            // quantidadeReceitas--;
        }

        // Loop for: igual ao JS
        for (int qtde = 4; qtde != 0; qtde--) {
            System.out.println("Essa é a receita " + qtde);
        }

        // Declaração de um array de strings: diferença que usamos chaves ao invés de []
        String[] receitas = {"Strogonoff", "Feijoada", "Rocambole"};

        // Imprimir itens do array funciona igual com o length
        for(int i = 0; i < receitas.length; i++) {
            System.out.println(receitas[i]);
        }

        // Arrays precisam ter tamanhos determinados
        // Dessa forma, eu declaro o tamanho, mas não os elementos
        String[] autores = new String[3];
        autores[0] = "Let";
        autores[1] = "André";
        autores[2] = "Claudia";

        // Um jeito melhor de fazer listas sem precisar determinar o tamanho são as Lists
        // Lembre-se de importar o List e o ArayList do java.utils
        List<String> autores2 = new ArrayList<>();

        // Para adicionar itens, usamos o add (tipo o push)
        autores2.add("Letícia");
        autores2.add("Bianca");

        // Para pegar um item, usamos o get (tipo array[0])
        System.out.println(autores2.get(0));

        // Existem outras fuções que podemos usar nos arrays. 
        //Consulte o compilado e a documentação para ver mais!
     

        System.out.println(tituloReceita);

    }
}

