package TesteIf;

public class Boolean {

	

		public static void main(String[] args) {

			System.out.println("Testando Condicionias");
			int idade = 10;
			int quantidadeDePessoas = 3;
			
			if (idade >= 18 || quantidadeDePessoas >= 2) {
				System.out.println("Pode entrar.");
			} else {
				
				System.out.println("Desculpa, voc� ainda � menor e n�o est� acompanhado.");
			}

		}
	}