package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Deseja fazer um depósito inicial (S/N)? ");
		char resposta = sc.next().charAt(0);
		System.out.println();
		if(resposta == 'S' || resposta == 's') {
			System.out.print("Digite o valor do depósito inicial: R$ ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para depósito: R$ ");
		double valorParaDeposito = sc.nextDouble();
		conta.deposito(valorParaDeposito);
		System.out.println();
		System.out.println("Dados atualizado da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para saque: R$ ");
		double valorParaSaque = sc.nextDouble();
		conta.saque(valorParaSaque);
		System.out.println();
		System.out.println("Dados atualizado da conta: ");
		System.out.println(conta);
		
		sc.close();
	}

}
