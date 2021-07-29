package OrientacaoObjeto;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da Primeira COnta é: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("o saldo Segunda Conta: " + segundaConta.saldo);

	}

}
