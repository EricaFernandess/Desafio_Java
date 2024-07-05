import java.util.Scanner;

public class ContaTerminal {

    // Declarando variáveis
        private int numero;
        private String agencia;
        private String nomeCliente;
        private double saldo;

        public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
            this.numero = numero;
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }
        // Solicitando que o usuário digite os dados para criação da conta
        public void solicitarDados() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Por favor, digite o número da Agência! ");
            this.numero = scanner.nextInt();

            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

            System.out.print("Por favor, digite sua Agência! ");
            this.agencia = scanner.nextLine();

            System.out.print("Por favor, digite o seu nome completo! ");
            this.nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o saldo que deseja depositar! ");
            this.saldo = scanner.nextDouble();

        }
        // Concatenando o texto para exibir após o imput das informações pelo usuário.
        public void exibirDados() {
            System.out.println("Olá," + this.nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia +
                    ", conta " + this.numero + " e seu saldo de R$" + this.saldo + " já está disponível para saque.");
        }

        // Determina o padrão de inicialização
        public static void main(String[] args) {
            ContaTerminal contaTerminal = new ContaTerminal(0, "", "", 0.0);

            // Solicitando que o usuário digite os dados para abertura de conta
            contaTerminal.solicitarDados();

            // Exibindo os dados digitados
            contaTerminal.exibirDados();
        }
}
