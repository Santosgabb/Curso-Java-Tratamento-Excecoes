package com.gabriel.cursojava.aulaexcecao;

public class AulaFinnalyPegadinha {
	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));

			} catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por 0");
				/*
				 * // Encerra a JVM imediatamente; o bloco finally NÃO será executado
				 * System.exit(0);
				 */
				System.exit(0);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do array invalida");
				System.exit(0);
			}

			finally {
				System.out.println("Essa linha sempre será executadda apos o try ou catch");
				System.out.println();
			}

		}

	}
}
