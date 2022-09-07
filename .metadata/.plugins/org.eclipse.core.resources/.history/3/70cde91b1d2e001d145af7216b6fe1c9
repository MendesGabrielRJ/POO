package br.com.poo.contas;

public class Conta {

	public int numero;
	public String titular;
	public double saldo;

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}

	}

	public boolean depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido!");
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	/*
	 * public void transferir(Conta destino, double valor) { this.sacar(valor);
	 * destino.depositar(valor);
	 */

	public boolean transferir(Conta contaDestino, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		} else {
			System.out.println("Valor inválido!");
			return false;

		}

	}
}