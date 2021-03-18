package Programa;

import Classes.Conta;
import Classes.Cliente;
import java.util.Scanner;

public class ProgramaConta {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente("Maicola", conta);

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
                    exibirSaldo(cliente);
                    break;
                case 2:
                    depositar(ler, cliente);
                    break;
                case 3:
                    sacar(ler, cliente);
                    break;
                default:
                    System.out.println("Operação inválida, Verifique.");
            }
        }

        ler.close();
    }

    private static void sacar(Scanner ler, Cliente cliente) {
        double valor;
        System.out.println("\nDigite o valor que deseja sacar: ");
        valor = ler.nextDouble();
        cliente.sacar(valor);
    }

    private static void depositar(Scanner ler, Cliente cliente) {
        double valor;
        System.out.println("\nDigite o valor que deseja depositar: ");
        valor = ler.nextDouble();
        cliente.depositar(valor);
    }

    private static void exibirSaldo(Cliente cliente) {
        cliente.exibirSaldo();
    }

    private static void exibeMenu() {
        System.out.println("Saldo (digite 1), Depositar (digite 2), Sacar (digite 3), Sair (digite 0): ");
    }
}