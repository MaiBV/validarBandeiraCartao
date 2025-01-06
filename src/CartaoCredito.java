import java.util.regex.Pattern;

public class CartaoCredito {
    private final String numero;

    public CartaoCredito(String numero) {
        this.numero = numero.replaceAll("[^\\d]", ""); // Remove espaços e traços
    }

    public String getNumero() {
        return numero;
    }

    public String validar() {
        // Verifica se o número do cartão é válido
        if (!Pattern.matches("\\d{13,19}", numero)) {
            return "Número de cartão inválido";
        }

        // Verifica a bandeira do cartão
        if (numero.startsWith("4")) {
            return "Visa";
        } else if (numero.startsWith("5") && (numero.charAt(1) >= '1' && numero.charAt(1) <= '5')) {
            return "MasterCard";
        } else if (numero.startsWith("34") || numero.startsWith("37")) {
            return "American Express";
        } else if (numero.startsWith("6")) {
            return "Discover-elo";
        } else {
            return "Bandeira não reconhecida";
        }
    }
}