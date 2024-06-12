import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        System.out.println("Bem-vindo à simulação bancária!");
        System.out.println("Opções:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar saldo");
        System.out.println("0. Encerrar programa");

        while (true) {
            int opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double saldoAtual = scanner.nextDouble();
                    saldo+=saldoAtual;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSacado = scanner.nextDouble();
                    if(valorSacado > saldo){
                        System.out.println("Saldo insuficiente.");
                    } else{
                        saldo -= valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.\n");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
