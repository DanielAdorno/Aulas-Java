package TesteIf;

public class TesteComIfs {

	public static void main(String[] args) {

		System.out.println("Testando Condicionias");
		int idade = 10;
		int quantidadeDePessoas = 3;
		if (idade >= 18) {
			System.out.println("Pode entrar.");
		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("Voc? n?o tem mais que 18, mas est? acompanhado.");
			}else
			
			System.out.println("Desculpa, voc? ainda ? menor e n?o est? acompanhado.");
		}

	}
}
