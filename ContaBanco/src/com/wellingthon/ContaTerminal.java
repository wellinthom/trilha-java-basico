package com.wellingthon;

import java.util.Locale;
import java.util.Scanner;

import com.wellingthon.javabasico.model.ContaBancaria;

/**
 * ContaTerminal
 * Cria e fornece informações sobre a conta bancaria criada
 * <b>Implementação e teste</b>
 *
 * @author Wellingthon
 * @version 1.0
 * @since 30/03/2025
 */

public class ContaTerminal {
    /**
     * Metodo main, inicia o código do banco
     * 
     * @param args entradas que podem ser passada ao iniciar o projeto pelo terminal
     *             ou ide
     *             (nome) [String] Nome do Cliente que quer criar uma conta
     *             agencia [String] Agência do Cliente que quer criar uma conta
     *             numeroConta [int] Numero da conta do Cliente que quer criar uma
     *             conta
     *             saldo [Float] Saldo desejado do Cliente que quer criar uma conta
     * @throws Exception pode acontecer erros ao inserir valores invalidos
     */

    public static void main(String[] args) throws Exception {

        System.out.println("Olá, sejá bem vindo ao terminal de acesso a conta Bancaria!");

        separarLinhasConsole();
        System.out.println("Por favor, insira as informações solicitadas!");
        separarLinhasConsole();

        // Declaração de variavel scanner, que permite entradas pelo terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Nome Completo:");
        String nome = scanner.next();
        separarLinhasConsole();

        System.out.println("Numero da Agencia ex:[000-0]:");
        String agencia = scanner.next();
        separarLinhasConsole();

        System.out.println("Numero da conta:");
        int numeroConta = scanner.nextInt();
        separarLinhasConsole();

        System.out.println("Saldo desejado:");
        float saldo = scanner.nextFloat();
        separarLinhasConsole();

        // Instanciar nova conta
        ContaBancaria contaBancaria = new ContaBancaria(agencia, numeroConta, nome, saldo);
        System.out.println(criarMensagemBoasVindas(contaBancaria));
        separarLinhasConsole();

        System.out.println("O banco agradece, volte sempre!");

    }

    /**
     * Separador de linhas do console
     */

    public static void separarLinhasConsole() {
        System.out.println("...");
    }

    /**
     * Gera uma mensagem de boa vindas ao cliente que cria sua conta bancaria
     * 
     * @param contaBancaria conta bancaria
     * @return String "Mensagem de boa vindas"
     */
    public static String criarMensagemBoasVindas(ContaBancaria contaBancaria) {
        return "Olá ".concat(contaBancaria.getNomeCliente()).concat(", ")
                .concat("obrigado por criar uma conta em nosso banco, ")
                .concat("sua agência é ").concat(contaBancaria.getAgencia()).concat(", ")
                .concat("conta ").concat(String.valueOf(contaBancaria.getNumero())).concat(" ")
                .concat("e seu saldo ").concat(String.valueOf(contaBancaria.getSaldo())).concat(" ")
                .concat("já está disponivel para saque");
    }
}
