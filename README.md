
# Projeto FIAP: Encapsulamento, Herança e Polimorfismo - Sistema de Funcionários

Este projeto é parte do módulo de Orientação a Objetos da FIAP e tem como objetivo explorar conceitos fundamentais como encapsulamento, herança, polimorfismo, criação de classes, métodos abstratos e interação entre objetos no contexto de um sistema de gerenciamento de funcionários.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **`src/br/com/fiap/model`**: Contém as classes que representam o modelo do sistema de funcionários.
  - **`Funcionario.java`**: Classe abstrata que define os atributos e comportamentos comuns a todos os funcionários, como nome, CPF, endereço e salário.
  - **`Gerente.java`**: Classe que estende `Funcionario` e implementa os métodos abstratos específicos para gerentes, como cálculo de bônus baseado no faturamento semestral.
  - **`Programador.java`**: Classe que estende `Funcionario` e implementa os métodos abstratos específicos para programadores, incluindo o cálculo de bônus fixo.
  - **`Vendedor.java`**: Classe que estende `Funcionario` e implementa os métodos abstratos específicos para vendedores, como cálculo de bônus baseado nas vendas semestrais.
  - **`Endereco.java`**: Classe que representa o endereço de um funcionário.

- **`src/br/com/fiap/view`**: Contém as classes responsáveis pela interação com o usuário.
  - **`ViewGerente.java`**: Classe para a interface de interação com gerentes, permitindo cadastrar, alterar e exibir detalhes de gerentes.
  - **`ViewProgramador.java`**: Classe para a interface de interação com programadores, permitindo cadastrar, alterar e exibir detalhes de programadores.
  - **`ViewVendedor.java`**: Classe para a interface de interação com vendedores, permitindo cadastrar, alterar e exibir detalhes de vendedores.

## Funcionalidades

- **Cadastro de Funcionários**: O sistema permite o cadastro de diferentes tipos de funcionários (gerentes, programadores e vendedores), cada um com seus próprios atributos e métodos específicos.
- **Cálculo de Bônus**: Cada tipo de funcionário possui uma regra de cálculo de bônus diferente, implementada através de polimorfismo.
- **Exibição de Informações**: O sistema permite a exibição dos detalhes dos funcionários cadastrados, mostrando informações como nome, CPF, endereço, salário, e bônus.

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/jpncaetano/FIAP-Encapsulamento.git
   ```

2. Importe o projeto em sua IDE Java preferida (recomendado: IntelliJ IDEA).

3. Execute as classes de visualização localizadas em `src/br/com/fiap/view/` para interagir com o sistema:
   - `ViewGerente.java`
   - `ViewProgramador.java`
   - `ViewVendedor.java`

## Exemplos de Código

### Criação e Exibição de um Gerente

```java
Gerente gerente = new Gerente("Alice", "12345678900", new Endereco("Rua A", 100, "Apto 101", "12345-678", "São Paulo", "SP"), 10000, 101, 1234, 500000);
System.out.println(gerente.getDetalhamento());
```

### Cálculo de Bônus para um Vendedor

```java
Vendedor vendedor = new Vendedor("Bob", "98765432100", new Endereco("Rua B", 200, "Casa", "98765-432", "Rio de Janeiro", "RJ"), 3000, 100000);
double bonus = vendedor.getBonus();
System.out.println("Bônus semestral: R$" + bonus);
```

## Tecnologias Utilizadas

- **Java**
- **IntelliJ IDEA**

## Notas

Este projeto foi desenvolvido com o objetivo de praticar conceitos avançados de Programação Orientada a Objetos, como encapsulamento, herança e polimorfismo. A organização do código reflete boas práticas de design, como a utilização de classes abstratas e métodos polimórficos.

## Autor

- [João Caetano](https://github.com/jpncaetano)
