import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao sistema bancário");
		System.out.println("Digite seu nome completo");
		String nome = leitor.nextLine();
		System.out.println("Digite seu cpf");
		String cpf = leitor.nextLine();
		
		Banco conta = new Banco(nome, cpf);
		
		conta.exibirMenu();
		
		leitor.close();
	}

}
