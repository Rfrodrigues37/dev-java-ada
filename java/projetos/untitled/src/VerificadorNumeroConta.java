import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.print("Digite o numero da conta: ");
                String numeroConta = scanner.nextLine();
                verificarNumeroConta(numeroConta);
                System.out.println("Numero de conta valido");
                continuar = false; // aqui você pode definir uma condição para sair do loop
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos");
        }
    }
}

