
import java.util.Scanner;

public class Banco {
	String nome;
	String cpf;
	double saldo;
	
	
	public Banco (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.0;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Depósito de R$" + valor + " efetuado com sucesso \n");
	}
	
	public void sacar(double valor) {
		if(saldo > valor) {
			saldo = saldo - valor;
			System.out.println("Saque de R$" + valor + " efetuado com sucesso. \n");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	
	public void exibirMenu() {
		Scanner leitor = new Scanner(System.in);
		int op;
		do {
		System.out.println("Digite alguma das opções abaixo: \n");
		System.out.println("1 - Consultar Saldo \n");
		System.out.println("2 - Realizar Depósito \n");
		System.out.println("3 - Realizar Saque \n");
		System.out.println("4 - Encerrar \n");
		op = leitor.nextInt();
		
		if (op == 1) {
			System.out.println("Saldo atual: R$" + this.consultarSaldo());
		}
		else if (op == 2) {
			System.out.println("Digite o valor do depósito \n");
			double valorDe = leitor.nextDouble();
			this.depositar(valorDe);
		}
		else if (op == 3) {
			System.out.println("Digite o valor do saque \n");
			double valorSa = leitor.nextDouble();
			this.sacar(valorSa);
		}
		
		else if (op == 4) {
			System.out.println("Até depois.n");
		}
		
		else {
			System.out.println("Digite algo valido \n");
		}
		}
		while (op != 4);
			leitor.close();
	}
}
