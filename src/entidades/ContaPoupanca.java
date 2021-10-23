package entidades;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void infoConta() {
		System.out.println("=== Info Conta Poupança ===");
		super.imprimirInfosComuns();
		
	}
}