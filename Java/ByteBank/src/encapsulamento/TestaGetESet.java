package encapsulamento;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(4865,89);
		
		System.out.println("N?mero da Conta: " + conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Marcelino");
		
		conta.setTitular(paulo);
		
		System.out.println("Titular da Conta: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
	}
}
