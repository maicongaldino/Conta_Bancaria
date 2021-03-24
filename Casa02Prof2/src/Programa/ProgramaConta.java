package Programa;

import Classes.Conta;
import Classes.Cliente;
import java.util.Scanner;

public class ProgramaConta {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Cliente cliente = new Cliente("Maicola", "12345678910");
        Conta conta = new Conta(1, cliente);

        int i=-1;
        
        while (i != 0) 
        {
            exibeMenu();
            i = ler.nextInt();

            switch (i)
            {
                case 0: 
                    System.out.println("\nEncerrando...");
                    return;
                case 1:
                    exibirSaldo(conta);
                    break;
                case 2:
                    depositar(ler, conta);
                    break;
                case 3:
                    sacar(ler, conta);
                    break;
                default:
                    System.out.println("Operação inválida, Verifique.");
            }
        }

        ler.close();
    }

    private static void sacar(Scanner ler, Conta conta) {
        double valor;
        System.out.println("\nDigite o valor que deseja sacar: ");
        valor = ler.nextDouble();
        conta.getCliente().sacar(valor);
    }

    private static void depositar(Scanner ler, Conta conta) {
        double valor;
        System.out.println("\nDigite o valor que deseja depositar: ");
        valor = ler.nextDouble();
        conta.getCliente().depositar(valor);
    }

    private static void exibirSaldo(Conta conta) {
        conta.getCliente().exibirSaldo();
    }

    private static void exibeMenu() {
        System.out.println("Saldo (digite 1), Depositar (digite 2), Sacar (digite 3), Sair (digite 0): ");
    }
}