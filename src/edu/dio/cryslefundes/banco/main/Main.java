package edu.dio.cryslefundes.banco.main;

import static edu.dio.cryslefundes.banco.Conta.ContaBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da sua conta bancária: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        var builder = new ContaBuilder();

        var conta = builder
                .numero(numeroConta)
                .agencia(agencia)
                .nomeCliente(nomeCliente)
                .saldo(saldo)
                .build();

        String out = String.format(
                "%nOlá, %s , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque.%n",
                conta.getNomeCliente(),
                conta.getAgencia(),
                conta.getNumero(),
                conta.getSaldo()
        );

        System.out.println(out);
    }
}
