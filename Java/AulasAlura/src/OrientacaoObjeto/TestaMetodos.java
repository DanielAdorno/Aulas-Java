package OrientacaoObjeto;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoDaniel = new Conta();

		contaDoDaniel.saldo = 100;
		contaDoDaniel.deposita(50);

		System.out.println("Você tem de saldo: R$" + contaDoDaniel.pegaSaldo());
		
		contaDoDaniel.saca(50);
		
		System.out.println("Você tem de saldo: R$" + contaDoDaniel.pegaSaldo());
		
		Conta contaDaRaquel = new Conta();
		contaDaRaquel.saldo = 1000;
		if(contaDaRaquel.tranfere(3000, contaDoDaniel)){
			System.out.println("Transferencia Realizada!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println("Você tem de saldo: R$" + contaDoDaniel.pegaSaldo());
		System.out.println("Você tem de saldo: R$" + contaDaRaquel.pegaSaldo());
		
		Cliente daniel = new Cliente();
		daniel.nome = "Daniel Adorno";
		daniel.cpf = "701963651-98";
		daniel.profissao = "Programador";
		
		contaDoDaniel.titular = daniel;
		
		System.out.println(contaDoDaniel.titular.nome);
		System.out.println(contaDoDaniel.titular.cpf);

	}
}
