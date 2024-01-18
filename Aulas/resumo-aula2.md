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

# Compilado 3 - COnstructor