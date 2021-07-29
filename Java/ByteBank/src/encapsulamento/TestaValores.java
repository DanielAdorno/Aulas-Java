package encapsulamento;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(4864, 9201);

		System.out.println(conta.getAgencia());

		Conta conta2 = new Conta(4867, 9209);

		System.out.println(conta2.getAgencia());
		
		System.out.println(Conta.getTotal());
	}
}
