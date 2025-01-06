import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número do cartão de crédito: ");
            String numeroCartao = scanner.nextLine(); // Lê a entrada do usuário
            CartaoCredito cartao = new CartaoCredito(numeroCartao);
            String bandeira = cartao.validar();
            System.out.println("A bandeira do cartão é: " + bandeira);
            // Fecha o scanner
        }
    }
}