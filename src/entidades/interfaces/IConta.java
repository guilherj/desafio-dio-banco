package entidades.interfaces;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void infoConta();
	
	void imprimirExtrato();
}
