# Compilado 1 - Criando um proj Java

- No linux ou windows: ctrl + shift + p

- Java: Create Java Project…

- No build tools (Neste caso, posteriormente usamos o Maven)

- EM cima do public está run, rode o projeto

# Compilado 2 - Variaveis, tipagem, condicionais e laços

##  Variveis e tipos

- Statement / Instrução no Java não funciona fora dos métodos!
Ou seja: códigos como if, else, for ou while, só funcionam dentro de alguma função.

- String nomeBanda = "Metallica";

- use sout + entender para aparecer o console.log do java

- int numeroInteiro = 10; // Numeros inteiros sem ponto ou vírgula
- String nome = "Driven Education" // Sequência de caracteres qualquer
- double valorDaCompra = 18.20; // Valores com ponto flutuante
- boolean temPermissao = true; // Sempre true ou false


### Concatenação
String nome = "Mara";
String sobreNome = "Maravilha";
String nomeCompleto = nome + " " + sobrenome;

## Condicionais

```java
// estrutura if/else:
// Usando operadores de comparação
if (1 == 1) {
	System.out.println("condição é verdadeira");
} else {
	System.out.println("condição é falsa");
}
```


```java
// expressão booleana:
int nivelAcesso = 2;

if (nivelAcesso == 3) { // comparador de igualdade é == e não ===
	System.out.println("Usuário admin");
}
```


- Demais comparadores também funcionam! `>`   `>=`   `<`   `<=`   `==`   `!=`
- Além disso, temos os mesmos operadores lógicos que tinha no JS: `&&`   `||`   `!`


## Laços

```java
int i = 0;

while (i < 10) {
    System.out.println(i);
    i++;
}
```

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

# Compilado 3 - Arrays e Listas

- No Java arrays devem ter um tamanho pré-estabelecido

```java
// Iniciando com valores! Não preciso informar quantidade.
String[] meuArray = {"a", "b", "c"};

// Iniciando sem valores! Preciso informar a quantidade de posições
String[] meuArray = new String[10];

// Agora que temos as posições do array criadas, podemos preencher com informações, usando o índice do array:
meuArray[0] = "Xablau";

// Posso usar um **for** para percorrer o array, colocando valores nas posições:
for(int i = 0; i < meuArray.length; i++) {
    meuArray[i] = "Minha posição é: " + i;
}
```

- Para trabalhar com array infinito, em situações onde não sabemos como vai ficar o tamanho do array, podemos trabalhar com a coleção **List** e **ArrayList**.

import java.util.ArrayList;
import java.util.List;

```java
class App {
    public static void main(String[] args) {
			List<String> meuArrayInfinito = new ArrayList<>(); // Criando o array

			int i = 0;
			while (i < 5) {
			    String valorAtual = "Minha posição no array é: " + i;
			    meuArrayInfinito.add(valorAtual);
			    i++;
			}
			
			System.out.println(meuArrayInfinito.get(2)); // Pegando um item do array

	}
}
```

- OBS: Perceba que diferente do Array comum onde podemos atribuir valor utilizando o =, em coleções usando List, devemos usar o método add para adicionar, e o get para pegar o valor pelo índice.


## Outros métodos legais que podem ser usados com o List:
```java
List<String> meuArrayInfinito = new ArrayList<>();

// Para saber o tamanho da minha lista
meuArrayInfinito.size();

// Serve para encontrar o índice a partir do valor
meuArrayInfinito.indexOf("Valor");

// Verifica se o array está vazio
meuArrayInfinito.isEmpty();

// Saber se na lista existe determinado valor
meuArrayInfinito.contains("Valor");

// Limpa a lista
meuArrayInfinito.clear();
```