package com.ramon.app;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da sua conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
