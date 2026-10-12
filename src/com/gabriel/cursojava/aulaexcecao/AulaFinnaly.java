package com.gabriel.cursojava.aulaexcecao;

public class AulaFinnaly {
	public static void main (String [] args) {
		
		
		/*UTLIZAÇÃO 
		 * ABRIR ARQUIVO
		 * REALIZAR LEITURA
		 * OCORRE ERRO
		 * FECHA ARQUIVO NO FINALLY
		 */
		
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));

			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao dividir por 0");
			}
			// utlilizando o FINNALY, sempre sera executado
			finally {
				System.out.println("Essa linha sempre será executadda apos o try ou catch");
			}
		
		
	}

}
}
