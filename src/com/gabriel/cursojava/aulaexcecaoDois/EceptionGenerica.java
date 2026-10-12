package com.gabriel.cursojava.aulaexcecaoDois;

public class EceptionGenerica {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));

			} catch (Exception e) {
				// exibe a mensagem do possivel erro
				System.out.println(e.getMessage());

				// descobre onde foi o erro
				e.printStackTrace();

			}
			
		}
	}
}