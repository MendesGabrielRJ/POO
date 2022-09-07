package br.com.poo.principal;

import br.com.poo.contas.Conta;

public class Principal {

	public static void main(String[] args) {

		Conta minhaConta = new Conta("Quézia", 123, 1000.0);			
		Conta novaConta = new Conta("Sulamita", 456, 900.0);

		minhaConta.sacar(50.0);
		minhaConta.depositar(20.0);

		minhaConta.transferir(novaConta, 500.0);
		
		minhaConta.sacar(100.0);
		
		minhaConta.sacar(370.00);
		

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