# Projeto: Abertura de Conta - Via Terminal Java

Este projeto em Java é um exemplo simples de um sistema de terminal de contas bancárias, onde o usuário pode inserir informações sobre sua conta e o sistema exibe uma mensagem de confirmação com os detalhes fornecidos.

## Descrição

A classe `ContaTerminal` permite que um usuário crie uma conta bancária fornecendo o número da agência, o número da conta, o nome do cliente e o saldo inicial. Após a inserção dos dados, o sistema exibe uma mensagem de confirmação com os detalhes fornecidos.

## Funcionalidades

- Solicitação de dados do usuário para criar uma conta bancária.
- Exibição de uma mensagem de confirmação com os detalhes da conta criada.

## Estrutura do Código

### Classe `ContaTerminal`

#### Variáveis de Instância

- `private int numero`: Armazena o número da conta.
- `private String agencia`: Armazena o número da agência.
- `private String nomeCliente`: Armazena o nome completo do cliente.
- `private double saldo`: Armazena o saldo inicial da conta.

#### Construtor
```java
public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo)
```

Inicializa as variáveis de instância com os valores fornecidos.

#### Métodos

- `public void solicitarDados()`: Solicita que o usuário digite o número da agência, o número da conta, o nome completo e o saldo inicial. Utiliza a classe Scanner para capturar a entrada do usuário.

- `public void exibirDados()`: Exibe uma mensagem de confirmação com os detalhes da conta criada.

## Método `main`

```java
public static void main(String[] args)
```
O ponto de entrada do programa. Cria uma instância de `ContaTerminal` e chama os métodos `solicitarDados` e `exibirDados`.

### Exemplo de Uso
Ao executar o programa, o usuário será solicitado a inserir as seguintes informações:

1. Número da agência.
2. Número da conta.
3. Nome completo.
4. Saldo inicial.

Após a inserção dos dados, o sistema exibirá uma mensagem de confirmação com os detalhes fornecidos.

### Exemplo de Entrada e Saída
Entrada:
```yaml
Por favor, digite o número da Agência! 1234
Por favor, digite sua Agência! 56789-0
Por favor, digite o seu nome completo! João Silva
Por favor, digite o saldo que deseja depositar! 1500.00
```

Saída:
``` css
Olá, João Silva, obrigado por criar uma conta em nosso banco, sua agência é 56789-0, conta 1234 e seu saldo de R$1500.0 já está disponível para saque.
```

## Como Executar
1. Certifique-se de ter o Java Development Kit (JDK) instalado.
2. Compile o arquivo ContaTerminal.java:

```bash
javac ContaTerminal.java
```
3. Execute o programa:

```bash
java ContaTerminal
```

## Requisitos
- Java 8 ou superior

```arduino
Este README fornece uma visão geral do projeto, descreve a funcionalidade, a estrutura do código, como executar o programa, e inclui um exemplo de entrada e saída. Certifique-se de ajustar qualquer detalhe conforme necessário para corresponder ao seu projeto específico.
```


