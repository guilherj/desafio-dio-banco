package aplicacao;

import java.util.Scanner;

import entidades.Banco;
import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do Banco:");
		String bancoNome = teclado.nextLine();
		
		Banco banco = new Banco(bancoNome);
		
		System.out.println("Quantas Contas deseja cadastrar?");
		int esc = teclado.nextInt();
		
		
		for(int i = 1; i <= esc; i++) {
			
			teclado.nextLine();
			System.out.println("Digite o nome do Cliente " + i + ":");
			String clienteNome = teclado.nextLine();
			
			Conta cc = new ContaCorrente(new Cliente(clienteNome), banco);
			banco.adicionarConta(cc);
			
			System.out.println("Ao criar uma conta corrente é necessario fazer um deposito inicial");
			System.out.println("Qual valor do deposito inicial para abertura de conta?");
			double dep = teclado.nextDouble();
			
			cc.depositar(dep);
			
			System.out.println("Deseja criar uma conta poupança para esta conta corrente? (s/n)");
			char opcao = teclado.next().charAt(0);
			
			if(opcao == 's') {
				Conta cp = new ContaPoupanca(new Cliente(clienteNome), banco); 
				banco.adicionarConta(cp);
				System.out.println("Quanto deseja depositar na conta poupança?");
				double depCp = teclado.nextDouble();
				
				cp.depositar(depCp);			
			}
			
						
		}
		
		banco.listarContas();	
		
			teclado.close();
			
		}
		
	}


