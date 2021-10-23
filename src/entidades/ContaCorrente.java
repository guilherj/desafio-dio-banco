package entidades;

public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}
	
	@Override
	public void sacar(double valor) {
		
		//Cobrando taxa de 2% apenas para saques da conta corrente
		double taxa = 0.02;
		valor = valor - (valor * taxa);		
		saldo -= valor;
	}
	

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void infoConta() {
		System.out.println("=== Info Conta Corrente ===");
		super.imprimirInfosComuns();
		
	}
	
}
