package com.gabriel.cursojava.aulaexcecaoDois;

public class CriandoException {
	public static void main(String[] args) {

		// CRIANDO UMA EXCEÇÃO e usando ela

		int[] numeros = { 4, 8, 5, 21, 3, 2, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				if (numeros[i] % 2 != 0) {
					/*Lança a execption aqui
					throw new Exception("Numero impar, divisão nao exata...");
				*/
					throw new DivisaoNaoExata(numeros[i], denominador[i]);
				}
				System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException  | DivisaoNaoExata e) {
				System.out.println("Houve um erro");
				e.printStackTrace();
			}
			

		}

	}

}
