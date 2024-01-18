# Compilado 1 - Classes e fundamentos

## Classes

- Declaração é feita da seguinte forma: public class NomeClasse
- Padrão de nomenclatura CamelCase
- Deve possuir o mesmo nome do arquivo que a contém

```java
public class User {
}
```

Atributos para essa classe: **características (atributos)**

```java
public class User {
	int age;
	double height;
	String name;
	String address;
}
```

**Comportamentos (métodos)** que são representados da seguinte forma:
 <modificador de acesso?> <tipo do retorno> nomeMétodo()


```java
public class User {
	int age;
	double height;
	String name;
	String address;

	void growUp() {
		this.height += 10.0;
	}
}
```

## Os modificadores de acesso do java são:
    - `public`: Significa que o tal método pode ser acessado de qualquer lugar e por qualquer entidade que visualize a classe.
    - `private`: Não podem ser acessados por nenhuma outra classe! Somente a própria classe.
    - `protected`: Somente classes dentro do mesmo pacote ou através de herança podem acessar.
    - `default`: Se você não declarar nenhum dos modificadores acima, é assumido por padrão o default, que permite os métodos serem acessados somente por classes dentro do mesmo pacote.



Para criar uma instância de uma classe podemos utilizar, assim como em outras linguagens, a palavra **new**.

```java
// App.java
public class App {
    public static void main(String[] args) {
				// Aqui perceba que estamos tipando a variável joaquim
				// com um tipo da classe User, no java isso é permitido.
        User joaquim = new User();
        System.out.println(joaquim.height);
        joaquim.growUp();
        System.out.println(joaquim.height);
    }
}
```


## Composição de classes

```java
// Address.java
public class Address {
	String state;
	String city;
	String district;
	String street;
	int number;
}
```

```java
// User.java
public class User {
	int age;
	double height;
	String name;
	Address address;
     }
```

```java
// App.java
public class App {
    public static void main(String[] args) {
				Address novoEndereco = new Address();
				novoEndereco.state = "Rio de Janeiro";
				novoEndereco.city = "Duque de Caxias";
				novoEndereco.district = "Centro";
			
        User novoUsuario = new User();
				novoUsuario.name = "Joaquim";
        novoUsuario.address = novoEndereco;

        System.out.println(novoUsuario.address.city);
    }
}

```
# Compilado 2 - OO - Encapsulamento

## Encapsulamento

Deve-se prestar atenção no que geralmente não devem ser acessados e nem modificados de forma direta.
Busca-se privar ou proteger nossos atributos:

```java
// User.java
public class User {
	int age;
	double height;
	String name;
	private String cpf:
	private String email;
	String address;

	void growUp() {
		this.height += 10.0;
	}
}
```

**A boa prática é sempre deixar privados todos os atributos!**

```java
// User.java
public class User {
	int age;
	double height;
	String name;
	private String cpf:
	private String email;
	String address;

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		// Além de modificar o atributo, podemos colocar regras aqui.
		this.cpf = cpf;
	}

	void growUp() {
		this.height += 10.0;
	}
}
```


```java
// App.java
public class App {
    public static void main(String[] args) {			
        User novoUsuario = new User();
				novoUsuario.name = "Joaquim";

				// Funciona
				novoUsuario.setCpf("343.534.343-33");
				// Funciona
        System.out.println(novoUsuario.getCpf());
    }
}
```
# Compilado 3 - Constructor

**Busca-se dinamismo**

## Declarando construtor
Para declarar nosso construtor, devemos criar um método público, sem tipo de retorno, e com o mesmo nome da classe:

```java
// User.java
public class User {
	int age;
	double height;
	String name;
	private String cpf:
	private String email;
	String address;

	public User() {
		// Esse é o construtor da classe
	}
}
```

Como em outras linguagens, o construtor também pode receber parâmetros que serão passados na construção do objeto da classe:

```java
// User.java
public class User {
	int age;
	double height;
	String name;
	private String cpf:
	private String email;
	String address;

	public User(String name, String cpf, String email) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
	}
}
```

```java
User novoUser = new User("Ana Maia", "033.454.333-29", "ana@gmail.com");
```


No Java, podemos ter multiplos construtores para a nossa classe! Por exemplo, podemos ter um que não recebe nada, e outra que recebe parâmetros. Isso nos permite instanciar nossa classe User com ou sem parâmetros:

```java
// User.java
public class User {
	int age;
	double height;
	String name;
	private String cpf:
	private String email;
	String address;

	public User() {
	}

	public User(String name, String cpf, String email) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
	}
}
```

### A importância de ter um construtor sem parâmetros pode variar dependendo do contexto e dos requisitos do seu programa. Aqui estão algumas razões pelas quais pode ser útil ter um construtor sem parâmetros:

**Inicialização Padrão**: O construtor sem parâmetros permite a criação de objetos da classe com valores padrão. Se você não fornecer valores específicos durante a criação do objeto, os membros da classe podem ter valores padrão definidos no construtor sem parâmetros.

**Herança**: Se a classe User for estendida por outras classes, o construtor sem parâmetros pode ser necessário para garantir que as subclasses possam ser instanciadas sem a necessidade de fornecer parâmetros específicos na criação.

**Flexibilidade**: O construtor sem parâmetros oferece flexibilidade ao permitir a criação de objetos sem a necessidade de fornecer todos os detalhes imediatamente. Os valores podem ser atribuídos posteriormente por meio dos métodos da classe.

**Serialização e Desserialização**: Se a classe precisar ser serializada (convertida em um formato que pode ser salvo ou transmitido) e desserializada, o construtor sem parâmetros é muitas vezes necessário para a desserialização adequada.

**Injeção de Dependência**: Em certas situações, quando você está trabalhando com frameworks de injeção de dependência ou frameworks de teste, ter um construtor sem parâmetros pode facilitar a criação de instâncias da classe.