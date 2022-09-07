package br.com.poo.principal;

import br.com.poo.contas.Conta;

public class Principal {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		Conta novaConta = new Conta();

		minhaConta.titular = "Quézia";
		minhaConta.saldo = 1000.0;
		minhaConta.numero = 123;
		minhaConta.sacar(50.0);
		minhaConta.depositar(20.0);

		novaConta.titular = "Sulamita";
		novaConta.saldo = 900.0;
		novaConta.numero = 456;

		minhaConta.transferir(novaConta, 500.0);

		/*
		 * System.out.println("Saldo atual: " + minhaConta.saldo + "\nNome do titular: "
		 * + minhaConta.titular + "\nNúmero da conta: " + minhaConta.numero);
		 */

		System.out.println("\nNome do titular: " + minhaConta.titular + "\nNúmero da conta: " + minhaConta.numero
				+ "\nSaldo atual: " + minhaConta.saldo);
		System.out.println("\nNome do titular: " + novaConta.titular + "\nSaldo atual: " + novaConta.saldo
				+ "\nNome do titular: " + novaConta.titular);
	}
}