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